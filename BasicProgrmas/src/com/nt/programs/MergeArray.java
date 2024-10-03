package com.nt.programs;

public class MergeArray {

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 5, 7, 11, 12 };
		int n = arr1.length;
		int arr2[] = { 2, 4, 6, 8 };
		int m = arr2.length;
		mergeArrays(arr1, arr2, n, m);
	}

	public static void mergeArrays(int arr1[], int arr2[], int n, int m) {
		int i = 0, j = 0, k = 0;
		int arr3[] = new int[n + m];

		while (i < n && j < m) {
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}
		while (i < n)
			arr3[k++] = arr1[i++];
		while (j < m)
			arr3[k++] = arr2[j++];

		printArray(arr3, arr3.length);
	}

	public static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
