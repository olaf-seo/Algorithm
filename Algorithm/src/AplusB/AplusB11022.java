package AplusB;

import java.io.*;
import java.util.*;

public class AplusB11022 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int length=Integer.parseInt(br.readLine());
		for(int i=1; i<=length; i++) {
			st= new StringTokenizer(br.readLine());
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			System.out.println("Case #"+i+": "+A+" + "+B+" = "+(A+B));
		}
	}
}