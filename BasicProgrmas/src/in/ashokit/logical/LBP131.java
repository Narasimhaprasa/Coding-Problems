package in.ashokit.logical;

import java.util.Scanner;

/*sort an array of 0s, 1s and 2s

Implement a program to read an array and sort array elements with 0s, 1s and 2s.

input ------> size, array elements 
con --------> size<100
output -----> print sorted elements

Ex:
    5
    1 0 2 0 1

    output ---> 0 0 1 1 2*/

public class LBP131 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :::");
		int size = sc.nextInt();

		int[] a = new int[size];
		System.out.println("Enter the values ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		customSort(a, size);
	}

	public static void customSort(int a[], int size) {
		int i, j, temp;
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		// to print the elements
		for (i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
