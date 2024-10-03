package in.ashokit.logical;

import java.util.Scanner;

/*delete an element from first location in an array

Implement a program to delete an element from an array at the first position

input -------> size,array elements 
con ---------> size<100
output ------> return array after deleting from first location

Ex:
	5
	1 2 3 4 5

	output: 2 3 4 5*/

public class LBP121 {

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

		int[] e = deleteFirstElement(a, size);
		for (int i = 0; i < size - 1; i++) {
			System.out.print(e[i] + " ");
		}
	}

	public static int[] deleteFirstElement(int a[], int size) {
		int i, index = 0;
		for (i = 1; i < size; i++) {
			a[index++] = a[i];
		}
		return a;
	}
}
