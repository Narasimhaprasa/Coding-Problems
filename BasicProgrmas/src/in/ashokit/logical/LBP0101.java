package in.ashokit.logical;

import java.util.Scanner;

/*reading and writing an array

Implement a program to read an array element and write on the screen.

input -------> size of the array and array elements 
con ---------> size<100 
output ------> the given array

Ex:
	5
	1 2 3 4 5

	output:
	1 2 3 4 5*/

public class LBP0101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of the array :::");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("ENter a the elements ::");

		for (int i = 0; i < size; i++) {
			int element = sc.nextInt();
			a[i] = element;
		}

		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
