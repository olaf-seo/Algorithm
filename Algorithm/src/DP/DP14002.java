package DP;

import java.io.*;
import java.util.StringTokenizer;

public class DP14002 {
	static int d[];
	static int a[];
	static int v[];
	
	static void f(int k) {
		if(k==-1) return;
		f(v[k]);
		System.out.print(a[k] + " ");
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		d=new int[n];
		a=new int[n];
		v=new int[n];
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<n; i++) {
			d[i]=1;
			v[i]=-1;
			for(int j=0; j<i; j++) {
				if(a[j]<a[i] && d[i]<d[j]+1) {
					d[i]=d[j]+1;
					v[i]=j;
				}
			}
		}
		
		int ans =d[0];
		int k=0;
		for(int i=0; i<n; i++) {
			if(ans<d[i]) {
				ans=d[i];
				k=i;
			}
		}
		
		System.out.println(ans);
		f(k);
		
	}
}
