package com.nt.programs;

public class MatrixSort {

	public static void main(String[] args) {
		int a[][] = { { 3, 2, 1 }, { 6, 5, 4 }, { 9, 8, 7 } };
		//int a[][] = { { 12, 9, 5 }, { 7, 6, 4 }, { 9, 8, 7 } };
		//int a[][] = { { 3, 2, -1 }, { 6, 5, 4 }, { 9, 8, -7 } };
		//	int a[][][] = { { 3, 2, 1 }, { 6, 5, 4 }, { 9, 8, 7 }, { 12, 11, 10 } };
		int size = a.length;
		int[] ele = retriveMatrixArray(a, size);
		printArray(ele, size);
	}

	public static int[] retriveMatrixArray(int a[][], int size) {
		int i, j, k = 0;
		int[] ele = new int[size * size];
		for (i = 0; i < size; i++) {
			for (j = 0; j < size; j++) {
				ele[k++] = a[i][j];
			}
		}
		sort(ele, size);
		return ele;
	}

	public static void sort(int ele[], int size) {
		int i, j, temp, len = ele.length;
		for (i = 0; i < len; i++) {
			for (j = i + 1; j < len; j++) {
				if (ele[i] > ele[j]) {
					temp = ele[i];
					ele[i] = ele[j];
					ele[j] = temp;
				}
			}
		}
	}

	public static void printArray(int a[], int size) {
		int i, j, len = a.length, k = 0;
		int[][] m = new int[size][size];
		for (i = 0; i < size; i++) {
			for (j = 0; j < size; j++) {
				m[i][j] = a[k++];
			}
		}
		for (i = 0; i < size; i++) {
			for (j = 0; j < size; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
