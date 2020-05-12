package Queue;

import java.io.*;
import java.util.StringTokenizer;

public class Queue17298xxxx {
	static int nge[];
	
	public static void Nge(int n, int i) {
		int max=n;
		for(int j=i; j<nge.length; j++) {
			if(max<nge[j]) {
				max=nge[j];
				break;
			}
		}
		if(max==n) {
			System.out.print("-1 " );
		}else {
			System.out.print(max+" ");
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		nge= new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			nge[i]=Integer.parseInt(st.nextToken());
		}

		for(int i=0; i<n; i++) {
			Nge(nge[i], i);
		}
	}
}
