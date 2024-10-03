package com.nt.programs;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
		//int[] arr = { 5, 6, 7, 8, 10, 11, 12, 13, 14 };
		int n = arr.length;
		int result = getMissingNumber(arr, n);
		System.out.println(result);
	}

	public static int getMissingNumber(int a[], int n) {
		int sum = ((n + 1) * (n + 2)) / 2;
		for (int i = 0; i < n; i++) {
			sum = sum - a[i];
		}
		return sum;
	}
}
