package in.ashokit.logical;

import java.util.Scanner;

/*Mini Peaks

Write a function that returns all the elements in an array that are strictly greater than their adjacent left and right neighbors.

input ------> size, an array
con---------> Do not count boundary numbers, since they only have one left/right neighbor.
output -----> an array

Ex:
        5
        1 3 2 6 4 
        3 6 
*/
public class LBP149 {

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
		printArray(a, size);
	}

	public static void printArray(int a[], int size) {
		int i;
		for (i = 1; i < size - 1; i++) {
			if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
