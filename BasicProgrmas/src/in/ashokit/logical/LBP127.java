package in.ashokit.logical;

import java.util.Scanner;

/*array reverse

Write a program to reverse the elements present in an array

input ------> size, array elements 
con --------> size<100
output -----> return array in reverse

Ex:
	5
	1 2 3 4 5

	output: 5 4 3 2 1*/
public class LBP127 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of the array ::");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.println("Enter the values :::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		printReverseArray(a, size);
	}

	public static void printReverseArray(int a[], int size) {
		int i;
		for (i = size - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}
