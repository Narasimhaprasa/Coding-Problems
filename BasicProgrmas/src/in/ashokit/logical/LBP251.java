package in.ashokit.logical;
/*multiples of 10

Given an array A of N integer  numbers. The task is to rewrite the array by putting all multiples of 10 at the end of the given array.

Note: The order of the numbers which arenot multiples of 10 should remain unaltered, and similarly. the order of all multiples of 10 should be unaltered.

input ------> N and Array Elements
con --------> no
output -----> updated array

Ex:
    5
    10 11 20 23 30 ----> 11 23 10 20 30*/

import java.util.Scanner;

public class LBP251 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a array size ::");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the values ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		printNotMultipliesTen(a, size);
		printMultipliesTen(a, size);
	}

	public static void printNotMultipliesTen(int a[], int size) {
		int i, j;
		for (i = 0; i < size; i++) {
			if (a[i] % 10 != 0)
				System.out.print(a[i] + " ");
		}
	}

	public static void printMultipliesTen(int a[], int size) {
		int i;
		for (i = 0; i < size; i++) {
			if (a[i] % 10 == 0)
				System.out.print(a[i] + " ");
		}
	}

}
