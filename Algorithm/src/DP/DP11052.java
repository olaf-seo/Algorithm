package DP;

import java.io.*;
import java.util.StringTokenizer;

public class DP11052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		int p[]	= new int[n+1];
		int d[]	= new int[n+1];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			p[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if(d[i]<d[i-j]+p[j]) {
					d[i]=d[i-j]+p[j];
				}
			}
		}
		
		System.out.println(d[n]);
		
		
		
	}
}
