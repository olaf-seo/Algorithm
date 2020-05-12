package graph;

import java.io.*;
import java.util.*;

public class graph1707 {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k= Integer.parseInt(br.readLine());
		
		while(k-->0) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int v=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			
			ArrayList<Integer> a[]=new ArrayList[v+1];
			for(int i=1; i<v+1; i++) {
				a[i]=new ArrayList<Integer>();
			}
			
			for(int i=0; i<e; i++) {
				st= new StringTokenizer(br.readLine());
				int from=Integer.parseInt(st.nextToken());
				int to=Integer.parseInt(st.nextToken());
				
				a[from].add(to);
				a[to].add(from);
			}
			
			int set[]=new int[v+1];
			for(int i=1; i<v+1; i++) {
				if(set[i]==0) {
				}
			}
			
			
		}
		
		
		
	}
}
