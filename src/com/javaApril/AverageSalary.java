package com.javaApril;

public class AverageSalary {

	public static void averageArray() {

		int[] arr = { 48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000 };
		int max = arr[1];
		int min = arr[1];
		int maxAt = 0;
		int minAt = 0;
		double sum = 0;
		double average;

		for (int i = 0; i < arr.length; i++) {

			if (max <= arr[i]) {
				max = arr[i];
				maxAt = i;
//				System.out.println("max i:" + i);
			}

		}

		for (int i = 0; i < arr.length; i++) {

			if (min >= arr[i]) {
				min = arr[i];
				minAt = i;
//				System.out.println("min i:" + i);
			}

		}

//		System.out.println("max:" + max + " maxAt:" + maxAt);
//		System.out.println("min:" + min + " minAt:" + minAt);

		for (int i = 0; i < arr.length; i++) {

			if (i != maxAt && i != minAt) {
				sum += arr[i];
			}
		}

//		System.out.println("sum:" + sum);

		average = sum / (arr.length - 2);

		System.out.println("Average:" + average);

	}

	public static void main(String[] args) {

		averageArray();
	}

}
