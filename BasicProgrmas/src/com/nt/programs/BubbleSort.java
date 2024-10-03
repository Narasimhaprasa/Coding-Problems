package com.nt.programs;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of an array::");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter a elements ::");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		bubbleSortAlgo(a, size);
	}

	public static void bubbleSortAlgo(int a[], int size) {
		int i, j, temp;
		for (i = 0; i < size - 1; i++) {
			for (j = 0; j < size - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		printArray(a, size);
	}

	public static void printArray(int a[], int size) {
		int i, j;
		for (i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
