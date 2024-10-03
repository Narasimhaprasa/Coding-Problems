package com.nt.programs;

public class ArrayOrder {

	public static void main(String[] args) {
		int arr[] = { 98, 45, 23, 12, 56, 2, 4, 5, 1, 10, 9, 55 };
		int len = arr.length, i, j;

		int[] res = arrangeTheValues(arr, len);
		 
		printArray(res);
		/*System.out.println();
		System.out.println("After sorting the values :::");
		sortArray(res, len);
		printArray(res);*/
	}

	public static int[] arrangeTheValues(int arr[], int len) {
		int i, j, m = 0;
		int res[] = new int[len];
		for (i = 0; i < len; i++) {
			if (arr[i] % 2 == 0) {
				res[m++] = arr[i];
			}
		}
		for (j = 0; j < len; j++) {
			if (arr[j] % 2 != 0) {
				res[m++] = arr[j];
			}
		}
		return res;
	}

	public static void sortArray(int ar[], int len) {
		int i, j;
		for (i = 0; i < len; i++) {
			for (j = i + 1; j < len; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}
	}

	public static void printArray(int arr[]) {
		int i, len = arr.length;
		for (i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
