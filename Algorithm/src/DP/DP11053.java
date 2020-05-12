package DP;

import java.io.*;
import java.util.StringTokenizer;

public class DP11053 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int d[]=new int[n];
		int a[]=new int[n];
		int result=0;
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<n; i++) {
			d[i]=1;
			for(int j=0; j<i; j++) {
				if(a[j]<a[i]) {
					d[i]=Math.max(d[i], d[j]+1);
				}
			}
			result=Math.max(d[i], result);
		}
		
		
		System.out.println(result);
	}
}
