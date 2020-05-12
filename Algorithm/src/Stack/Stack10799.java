package Stack;

import java.io.*;
import java.util.Stack;

public class Stack10799 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pipe=br.readLine().trim();
		Stack<Integer> stack=new Stack<>();		
		int size=0;
		
		int n= pipe.length();
		
		for(int i=0; i<n; i++) {
			char ch=pipe.charAt(i);
			
			if(ch=='(') {
				stack.push(i);
			}else {
				if(stack.peek()+1==i) {
					stack.pop();
					size+=stack.size();
				}else {
					stack.pop();
					size+=1;
				}
			}
		}
		System.out.println(size);
	}
}
