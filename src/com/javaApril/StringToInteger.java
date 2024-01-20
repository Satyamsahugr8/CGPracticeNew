package com.javaApril;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringToInteger {

	public static int mathPow(int n, int m) {

		int sum = 1;

		for (int i = 1; i <= m; i++) {
			sum *= n;
		}

		return sum;
	}

	public static double sqrt(double n) {

		double sum = 1;
		double num = 1;
		double dun = 2;

		for (double i = 1; i <= num/dun; i++) {
			sum *= n;
		}

		return sum;
	}

	public static int convertStringToInteger(String str) {

		// 123
		// 012
		int a;
		int sum = 0;
		int length = str.length();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('1', 1);
		map.put('2', 2);
		map.put('3', 3);
		map.put('4', 4);
		map.put('5', 5);
		map.put('6', 6);
		map.put('7', 7);
		map.put('8', 8);
		map.put('9', 9);
		map.put('0', 0);

		for (int i = 0; i < str.length(); i++) {

			for (Entry<Character, Integer> entry : map.entrySet()) {

				if (str.charAt(i) == entry.getKey()) {

					a = entry.getValue();
					sum += a * (mathPow(10, length - (i + 1)));

//					System.out.println("sum:"+sum);
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {

//		String s = "123";
//		System.out.println(convertStringToInteger(s));
		
		double n = 4;
		System.out.println(sqrt(n));

	}

}
