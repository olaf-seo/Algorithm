package graph;

import java.io.*;
import java.util.*;

public class graph11724 {
	static boolean c[];
	static ArrayList<Integer> a[];
	
	static void dfs(int x) {
		if(c[x]) {
			return;
		}
		c[x]=true;
		for(int y:a[x]) {
			if(!c[y]) {
				dfs(y); 
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int start=Integer.parseInt(st.nextToken());
		a=new ArrayList[n+1];
		for(int i=1; i<n+1; i++) {
			a[i]=new ArrayList<Integer>();
		}
		
		for(int i=0; i<m; i++) {
			st= new StringTokenizer(br.readLine());
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			
			a[u].add(v);
			a[v].add(u);
		}
		
		c=new boolean[n+1];
		int count=0;
		for(int i=0; i<n+1; i++) {
			if(!c[i]) {
				dfs(start);
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}
