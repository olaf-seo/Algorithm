package Queue;

import java.io.*;
import java.util.*;

public class Queue1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		StringBuilder sb=new StringBuilder();
		sb.append("<");
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=1; i<=n; i++) {
			queue.offer(i);
		}
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<k-1; j++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll()+", ");
		}
		sb.append(queue.poll()+">");
		System.out.println(sb);
	}
}
