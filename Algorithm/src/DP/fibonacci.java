package DP;

public class fibonacci {
	int memo[]=new int[100];
	
	int fibonacci1(int n) {
		if(n<=1) {
			return n;
		}else {
			return fibonacci1(n-1)+fibonacci1(n-2);		
		}
	}
	
	int fibonacci2(int n) {
		if(n<=1) {
			return n;
		}else {
			if(memo[n]>0) {
				return memo[n];
			}else {
				memo[n]=fibonacci2(n-1)+fibonacci2(n-2);
				return memo[n];
			}
		}
	}
}
