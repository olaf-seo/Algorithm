package Bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class Bruteforce1476 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int E = Integer.parseInt(st.nextToken())-1;
		int S = Integer.parseInt(st.nextToken())-1;
		int M = Integer.parseInt(st.nextToken())-1;
		
		for(int i=0;; i++) {
			if(i%15==E && i%28 == S && i%19==M) {
				System.out.println(i+1);
				break;
			}
		}
		
	}
}

/*
  public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();
        int e=1,s=1,m=1;
        for (int i=1;; i++) {
            if (e == E && s == S && m == M) {
                System.out.println(i);
                break;
            }
            e += 1;
            s += 1;
            m += 1;
            if (e == 16) {
                e = 1;
            }
            if (s == 29) {
                s = 1;
            }
            if (m == 20) {
                m = 1;
            }
        }
    }
 * */
