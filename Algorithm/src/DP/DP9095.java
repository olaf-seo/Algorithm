package DP;

import java.io.*;

public class DP9095 {
	static int d[]=new int[11];
	public static int function(int n) {
		if(d[n]>0) {
			return d[n];
		}else {
			d[n]=function(n-1)+function(n-2)+function(n-3);
			return d[n];
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		d[0]=1;
		d[1]=1;
		d[2]=2;
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(function(n));
		}
	}
}

/*
 public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] d = new int[11];
        d[0] = 1;
        for (int i=1; i<=10; i++) {
            for (int j=1; j<=3; j++) {
                if (i-j >= 0) {
                    d[i] += d[i-j];
                }
            }
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(d[n]);
        }
    }
}
 */
