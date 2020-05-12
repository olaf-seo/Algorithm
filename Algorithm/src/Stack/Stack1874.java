package Stack;

import java.io.*;
import java.util.Stack;

public class Stack1874 {
	
	public static void function(int []sq) {
		Stack<Integer> stack = new Stack<Integer>();
		int m=0;
		StringBuilder sb= new StringBuilder();
		for(int x:sq) {
			if(x>m) {
				while(x>m) {
					stack.push(++m);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			}else {
				if(stack.peek()!=x) {
					System.out.println("NO");
					return;
				}
				stack.pop();
				sb.append("-\n");
			}
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		int sq[]= new int[T];
		for(int i=0; i<T; i++) {
			sq[i]=Integer.parseInt(br.readLine());
		}
		function(sq);
		
	}
	
}
