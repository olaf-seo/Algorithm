package DP;

import java.io.*;

public class DP1699 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int d[]=new int[n+1];

		for(int i=1; i<=n; i++) {
			d[i]=i;
			for(int j=1; j*j<=i; j++) {
				d[i]=Math.min(d[i], d[i-j*j]+1);
			}
		}

		System.out.println(d[n]);
	}
}
