package com.nt.programs;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		//	int arr[] = { 12, 11, 5, 1, 3, 15 };
		int n = arr.length;

		QuickSort qb = new QuickSort();
		qb.sort(arr, 0, n - 1);

		System.out.println("Sorted array::");
		printArray(arr, n);

	}

	public static void printArray(int a[], int n) {
		int i;
		for (i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public void sort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			// recurrsively sort elements before partition and after partition
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}
}
