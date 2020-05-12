package DP;

import java.io.*;

public class DP11726 {
	static int d[];
	public static int function(int n) {
		if(d[n]>0) {
			return d[n];
		}else {
			d[n]=(function(n-1)+function(n-2))%10007;
			return d[n];
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		d= new int[n+1];
		d[0]=1;
		d[1]=1;
		System.out.println(function(n));
	}
}
