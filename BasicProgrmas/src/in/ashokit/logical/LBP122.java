package in.ashokit.logical;
/*delete an element from last location in an array

Implement a program to delete an element from an array at the last position

input -------> size,array elements 
con ---------> size<100
output ------> return array after deleting from last location

Ex:
	5
	1 2 3 4 5

	output: 1 2 3 4*/

import java.util.Scanner;

public class LBP122 {

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
		int[] e = deleteElementAtLastPosition(a, size);
		for (int i = 0; i < size - 1; i++) {
			System.out.print(e[i] + " ");
		}
	}

	public static int[] deleteElementAtLastPosition(int a[], int size) {
		int i;
		for (i = 0; i < size - 1; i++) {
			a[i] = a[i];
		}
		return a;
	}
}
