package DP;

import java.io.*;
import java.util.StringTokenizer;

public class DP1912 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int p[]	=new int[n];
		int d[]	=new int[n];
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			p[i]=Integer.parseInt(st.nextToken());
			d[i]=p[i];
		}
		
		int result=d[0];
		for(int i=1; i<n; i++) {
			d[i]=Math.max(d[i], d[i-1]+p[i]);
			result=Math.max(result, d[i]);
		}
		
		System.out.println(result);
		
	}
}
