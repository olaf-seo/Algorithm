package Stack;

import java.io.*;

public class Stack10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int stack[] = new int[n];
		int size=0;
		while(n-->0) {
			String []line=br.readLine().split(" ");
			if(line[0].equals("push")) {
				int num=Integer.parseInt(line[1]);
				stack[size++]=num;
			}else if(line[0].equals("pop")) {
				if(size!=0) {
					System.out.println(stack[size-1]);
                    size--;
				}else {
					System.out.println("-1");
				}
			}else if(line[0].equals("size")) {
				System.out.println(size);
			}else if(line[0].equals("empty")) {
				if(size!=0) {
					System.out.println("0");
				}else {
					System.out.println("1");
				}
			}else if(line[0].equals("top")) {
				if(size!=0) {
					System.out.println(stack[size-1]);
				}else {
					System.out.println("-1");
				}
			}
		}
		
	}
	
}

/*
 *  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] stack = new int[n];
	        int size = 0;
	        while (n-- > 0) {
	            String cmd = sc.next();
	            if (cmd.equals("push")) {
	                stack[size++] = Integer.parseInt(sc.next());
	            } else if (cmd.equals("top")) {
	                if (size == 0) {
	                    System.out.println("-1");
	                } else {
	                    System.out.println(stack[size-1]);
	                }
	            } else if (cmd.equals("size")) {
	                System.out.println(size);
	            } else if (cmd.equals("empty")) {
	                if (size == 0) {
	                    System.out.println("1");
	                } else {
	                    System.out.println("0");
	                }
	            } else if (cmd.equals("pop")) {
	                if (size == 0) {
	                    System.out.println("-1");
	                } else {
	                    System.out.println(stack[size-1]);
	                    size -= 1;
	                }
	            }
	        }
	        sc.close();
 * */
