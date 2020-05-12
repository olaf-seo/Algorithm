package Stack;

import java.io.*;
import java.util.Stack;

public class Stack1935 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		String postFix= br.readLine();
		
		double d[]	= new double[n];
		
		for(int i=0; i<n; i++) {
			d[i]=(double)Integer.parseInt(br.readLine());
		}
		
		Stack<Double> stack = new Stack<Double>();
		
		for(char ch: postFix.toCharArray()) {
			if(ch>='A' && ch<='Z') {
				stack.push(d[(int)(ch-'A')]);
			}else {
				double temp2=stack.pop();
				double temp1=stack.pop();
				if(ch=='+') {
					stack.push(temp1+temp2);
				}else if(ch=='-') {
					stack.push(temp1-temp2);
				}else if(ch=='*') {
					stack.push(temp1*temp2);
				}else if(ch=='/') {
					stack.push(temp1/temp2);
				}
			}
		}
		
		System.out.printf("%.2f",stack.pop());
	}
}
