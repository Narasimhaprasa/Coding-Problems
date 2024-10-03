package in.ashokit.logical;
/*increment every element in an array by one unit

Implement a program to increment every element by one unit in array.

input ------> size, array elements 
con --------> size<100
output -----> increment each element by one unit

Ex:
	5
	1 2 3 4 5

	output: 2 3 4 5 6*/

import java.util.Scanner;

public class LBP128 {

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
		incrementValueOneUnit(a, size);
	}

	public static void incrementValueOneUnit(int a[], int size) {
		int i;
		for (i = 0; i < size; i++) {
			System.out.print(a[i] + 1 + " ");
		}
	}
}
