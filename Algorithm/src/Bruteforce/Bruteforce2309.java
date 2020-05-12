package Bruteforce;

import java.io.*;
import java.util.Arrays;

public class Bruteforce2309 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=9;
		int d[]= new int[n];
		
		int sum=0;
		for(int i=0; i<d.length; i++) {
			d[i]=Integer.parseInt(br.readLine());
			sum+=d[i];
		}
		
		Arrays.sort(d);
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(sum-d[i]-d[j]==100) {
					for(int k=0; k<n; k++) {
						if(i==k || j==k) continue;
						System.out.println(d[k]);
					}
					System.exit(0);
				}
			}
			
		}
		
		
	}
}
