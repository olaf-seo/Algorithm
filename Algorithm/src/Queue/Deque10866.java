package Queue;

import java.io.*;
import java.util.ArrayDeque;

public class Deque10866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		ArrayDeque<Integer> deque= new ArrayDeque<Integer>();
		
		for(int i=0; i<n; i++) {
			String line[]=br.readLine().split(" ");
			String order=line[0];
			if(order.equals("push_front")) {
				int num=Integer.parseInt(line[1]);
				deque.offerFirst(num);
			}else if(order.equals("push_back")) {
				int num=Integer.parseInt(line[1]);
				deque.offerLast(num);
			}else if(order.equals("pop_front")) {
				if(deque.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(deque.pollFirst());
				}
			}else if(order.equals("pop_back")) {
				if(deque.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(deque.pollLast());
				}
			}else if(order.equals("size")) {
				System.out.println(deque.size());
			}else if(order.equals("empty")) {
				if (deque.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
			}else if(order.equals("front")) {
				if (deque.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(deque.peekFirst());
                }
			}else if(order.equals("back")) {
				if (deque.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(deque.peekLast());
                }
			}
			
		}
		
	}
}
