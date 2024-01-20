package com.javaApril;

public class Count1Binary {

	public static int hammingWeight(int n) {
		
		int count1 = 0;
		
		while (n > 0) {
//			System.out.print(n&1);
	        if ((n&1) == 1) {
	            count1++;
	        }
	        n = n >> 1;
		}
		return count1;
	}

	public static void main(String[] args) {
		
		System.out.println(hammingWeight(1010));
		
	}

}
