package in.ashokit.logical;

import java.util.Scanner;

/* sum of two arrays

Implement a program to find the sum of two arrays and display the result array

input -------> size and array elements
con ---------> no
output ------> print resultent array


Ex:
	5
	1 2 3 4 5
	1 1 2 2 3

	output: 2 3 5 6 8*/

public class LBP133 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :::");
		int size = sc.nextInt();

		int[] a = new int[size];
		int[] b = new int[size];

		System.out.println("Enter the a[] values ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		System.out.println("Enter the b[] values ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			b[i] = value;
		}
		calculateSumBetweenTwoArrays(a, b, size);
	}

	public static void calculateSumBetweenTwoArrays(int a[], int b[], int size) {
		int i, j, sum = 0;
		for (i = 0; i < size; i++) {
			sum = a[i] + b[i];
			System.out.print(sum + " ");
		}
	}
}
