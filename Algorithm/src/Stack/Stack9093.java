package Stack;

import java.io.*;
import java.util.Stack;

public class Stack9093 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t= Integer.parseInt(br.readLine());
		
		while(t-->0) {
			String S=br.readLine()+"\n";
			Stack<Character> stack=new Stack<Character>();
			for (char ch : S.toCharArray()) {
				if(ch=='\n' || ch==' ') {
					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(ch);
				}else {
					stack.push(ch);
				}
			}
		}
		bw.flush();
		bw.close();
	}
}

/*
 * public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		
		StringBuilder sb= new StringBuilder();
		
		while(t-->0) {
			String S=br.readLine();
			Stack<Character> stack=new Stack<Character>();
			String array[]=S.split(" ");
			for(int i=0; i<array.length; i++) {
				int n=array[i].length();
				for(int j=0; j<n; j++) {
					stack.push(array[i].charAt(j));
					if(stack.size()==n) {
						while(n-->0) {
							sb.append(stack.pop());
						}
						if(j!=n-1) {
							sb.append(" ");
						}
					}
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
		
	}
 * 
 * */
