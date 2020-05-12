package Queue;

import java.io.*;

public class Queue10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		int queue[]=new int[n];
		int first = 0;
		int last = 0;
		
		
		while(n-->0) {
			String line[]=br.readLine().split(" ");
			if(line[0].equals("push")) {
				int num=Integer.parseInt(line[1]);
				queue[last++]=num;
			}else if(line[0].equals("pop")) {
				 if (first != last) {
					 System.out.println(queue[first]);
					 first ++;
                } else {
                	System.out.println("-1");
                }
			}else if(line[0].equals("size")) {
				System.out.println(last-first);
			}else if(line[0].equals("empty")) {
				if(first!=last) {
					System.out.println("0");
				}else {
					System.out.println("1");
				}
			}else if(line[0].equals("front")) {
				if(first!=last) {
					System.out.println(queue[first]);
				}else {
					System.out.println("-1");
				}
			}else if(line[0].equals("back")) {
				if(first!=last) {
					System.out.println(queue[last-1]);
				}else {
					System.out.println("-1");
				}
			}
		}
	}
}
