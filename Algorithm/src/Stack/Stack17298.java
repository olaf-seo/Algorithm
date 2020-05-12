package Stack;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack17298 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int n= Integer.parseInt(br.readLine());
		int a[] = new int[n];
		int nge[]= new int[n];
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> stack= new Stack<Integer>();
		stack.push(0);
		
		for(int i=1; i<n; i++) {
			if(stack.isEmpty()) {
				stack.push(i);
			}
			while(!stack.isEmpty() && a[stack.peek()]<a[i]) {
				nge[stack.pop()]=a[i];
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			nge[stack.peek()]=-1;
		}
		
		for(int i=0; i<n; i++) {
			bw.write(nge[i]+" ");
		}
		bw.write("\n");
		bw.flush();
	}
}
