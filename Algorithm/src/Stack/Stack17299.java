package Stack;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack17299 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		int a[]=new int[n];
		int f[]=new int[n];
		int ngf[] = new int[n];
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
			f[a[i]]+=1;
		}
		
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(0);
		
		for(int i=1; i<n; i++) {
			if(stack.isEmpty()) {
				stack.push(i);
			}
			while(!stack.isEmpty() && f[stack.peek()]<f[i]) {
				ngf[stack.pop()]=a[i];
			}
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			ngf[stack.pop()]=-1;
		}
		
		
		
	}
}
