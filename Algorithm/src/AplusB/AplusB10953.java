package AplusB;

import java.io.*;

public class AplusB10953 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i=Integer.parseInt(br.readLine());
		while(i-->0) {
			String[] array=br.readLine().split(",");
			int A=Integer.parseInt(array[0]);
			int B=Integer.parseInt(array[1]);
			System.out.println(A+B);
		}
		
	}
}
