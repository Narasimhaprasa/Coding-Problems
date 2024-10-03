package com.nt.programs;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size::"); // 1 2 3 4 5    // 1 4 5 4 5 
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the value ::");
			arr[i] = sc.nextInt();
		}
		int minMarks = minMarks(size, arr);
		System.out.println("Sum of marks is :::" + minMarks);
	}

	public static int minMarks(int size, int[] arr) {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = arr[j] + 1;
				}
			}
		}
		//Arrays.sort(arr);
		int sum = 0;
		for (int k = 0; k < size; k++) {
			sum = sum + arr[k];
		}
		return sum;

	}
}
