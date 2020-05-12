package Bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class Bruteforce1107 {
	static boolean[] broken = new boolean[10];
	
	static int possible(int c) {
		if(c==0) {
			if(broken[0]) {
				return 0;
			}else {
				return 1;
			}
		}
		int len=0; 
		while(c>0) {
			if(broken[c%10]) {
				return 0;
			}
			len+=1;
			c/=10;
		}
		return len;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=null;
		if(n>0) {
			st= new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				int temp=Integer.parseInt(st.nextToken());
				broken[temp]=true;
			}
		}
		
		int result = answer -100;
		
		if(result<0) {
			result=-result;
		}
		
		for(int i=0; i<=1000000; i++) {
			int c=i;
			int len= possible(c);
			if(len>0) {
				int press=c-n;
				if(press<0) {
					press=-press;
				}
				if(result>len+press) {
					result= len+press;
				}
			}
		}
		
		
		
		
		
	}
	
		
}
