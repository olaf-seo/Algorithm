package Stack;

import java.io.*;

public class Stack9012{
	public static String function(String s) {
		int n=s.length();
		int size=0;
		for(int i=0;i<n; i++) {
			if(s.charAt(i)=='(') {
				size+=1;
			}else {
				size-=1;
			}
			if(size<0) {
				return "NO";
			}
		}
		if(size==0) {
			return "YES";
		}else {
			return "NO";
		}
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		while(T-->0) {
			System.out.println(function(br.readLine()));
		}
	}
}

/*import java.util.*;

public class Stack9012 {
	public static String isValid(String s) {
		int n= s.length();
		int cnt=0;
		for(int i=0; i<n; i++) {
			if(s.charAt(i)=='(') {
				cnt+=1;
			}else {
				cnt-=1;
			}
			if(cnt<0) {
				return "NO";
			}
		}
		if(cnt==0) {
			return "YES";
		}else {
			return "NO";
		}
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        while (n-- > 0) {
	            System.out.println(isValid(sc.next()));
	        }
	}
}
*/
