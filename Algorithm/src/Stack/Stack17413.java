package Stack;

import java.io.*;
import java.util.Stack;

public class Stack17413 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S=br.readLine();
		boolean tag=false;
		Stack<Character> stack=new Stack<Character>();
		
		for(char ch:S.toCharArray()) {
			
			if(ch=='<') {
				while(!stack.isEmpty()) {
					bw.write(stack.pop());
				}
				bw.write(ch);
				tag=true;
			}else if(ch =='>') {
				bw.write(ch);
				tag=false;
			}else if(tag) {			
				bw.write(ch);
			}else {
				if(ch==' ') {
					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(ch);
				}else {
					stack.push(ch);
				}
			}
			
			
		}
		while(!stack.isEmpty()) {
			bw.write(stack.pop());
		}
		bw.write("\n");
		bw.flush();
		
	}
}
