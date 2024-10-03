package com.nt.programs;

public class DuplicatesNumbers {

	public static void main(String[] args) {
		int a[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
		//int[] a = { 5, 4, 3, 2, 1, 5 };
		//	int[] a = { 10, 20, 10, 30, 40, 50, 30 };
		int n = a.length;

		for (int i = 0; i < n; i++) {
			a[a[i] % n] = a[a[i] % n] + n;
		}
		System.out.println("The repeating elements are ::");
		for (int i = 0; i < n; i++) {
			if (a[i] >= n * 2) {
				System.out.print(i + " ");
			}
		}
	}

}
