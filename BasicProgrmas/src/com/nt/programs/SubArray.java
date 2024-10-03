package com.nt.programs;

public class SubArray {

	public static void main(String[] args) {
		//	int arr[] = { 1, 4, 20, 3, 10, 5 };
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int n = arr.length;
		int sum = 23;
		subArraySum(arr, n, sum);
	}

	public static void subArraySum(int arr[], int n, int sum) {
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			int currentSum = arr[i];
			if (currentSum == sum) {
				System.out.println("Sum found at indexes" + i);
				//break;
			} else {
				for (int j = i + 1; j < n; j++) {
					currentSum = currentSum + arr[j];
					if (currentSum == sum) {
						flag = true;
						System.out.println("Sum found between indexes::" + i + " and " + j);
						//break;
					}
				}
			}
		}
		if (flag == false)
			System.out.println("No sub array found");

	}
}
