package com.javaApril;

public class NumProductSum {

	public static int subtractProductAndSum(int n) {
		int sum = 0;
		int product = 1;
		int digit;

		while (n != 0) {
			digit = n % 10;
			product *= digit;
			sum += digit;
			n = n / 10;
		}
		return product - sum;
	}

	public static void main(String[] args) {
		int b = subtractProductAndSum(4421);
		System.out.println(b);
	}

}
