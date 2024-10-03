package com.nt.programs;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of the array ::");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.println("Enter the values ::");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		int[] e = mergeSort(a, size);
		for (int i = 0; i < size; i++) {
			System.out.print(e[i] + " ");
		}
	}

	public static int[] mergeSort(int a[], int size) {
		int i, j, temp;
		for (i = 0; i < size; i++) {
			for (j = i; j < size - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
