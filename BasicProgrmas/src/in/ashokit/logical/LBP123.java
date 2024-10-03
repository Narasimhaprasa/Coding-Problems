package in.ashokit.logical;
/*delete an element from an array at the given location

Implement a program to delete an element from an array at the position

input -------> size,array elements and position
con ---------> size<100
output ------> return array after deleting from the location

Ex:
	5
	11 22 33 44 55
	1

	output: 11 33 44 55*/

import java.util.Scanner;

public class LBP123 {

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
		System.out.println("Enter a location of an element to delete ::");
		int loc = sc.nextInt();

		int[] e = removeEleAtGivenLoction(a, size, loc);
		for (int i = 0; i < size - 1; i++) {
			System.out.print(e[i] + " ");
		}
	}

	public static int[] removeEleAtGivenLoction(int a[], int size, int loc) {
		int i;
		for (i = loc; i < size - 1; i++) {
			a[i] = a[i + 1];
		}

		return a;
	}

}
