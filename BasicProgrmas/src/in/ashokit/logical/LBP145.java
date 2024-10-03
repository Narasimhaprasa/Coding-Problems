package in.ashokit.logical;

import java.util.Scanner;

/*Eliminate Odd Numbers within an Array

Create a function that takes an array of numbers and returns only the even values.

Note:

Return all even numbers in the order they were given.
All test cases contain valid numbers ranging from 1 to 3000.

input -----> size and an array
con -------> no
output ----> remove all odd numbers and print
Ex:
    5
    1 2 3 4 5

    output: 2 4
*/
public class LBP145 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :::");
		int size = sc.nextInt();

		int[] a = new int[size];
		System.out.println("Enter a[] the values ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		printEvenElements(a, size);
	}

	public static void printEvenElements(int a[], int size) {
		int i;
		for (i = 0; i < size; i++) {
			if (a[i] % 2 == 0)
				System.out.print(a[i] + " ");
		}
	}
}
