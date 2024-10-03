package in.ashokit.logical;

import java.util.Scanner;

/*Difference between two arrays

Implement a program to find the difference between two arrays

input -------> size and array elements
con ---------> no
output ------> print difference between two arrays as third array

Ex:
    5
    1 2 3 4 5
    1 1 2 2 3

    output: 0 1 1 2 2 
*/
public class LBP140 {

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
		int[] b = new int[size];
		System.out.println("Enter the b[] values :::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			b[i] = value;
		}
		calculateDifferenceOfTwoArrays(a, b, size);
	}

	public static void calculateDifferenceOfTwoArrays(int a[], int b[], int size) {
		int i, j;
		for (i = 0; i < size; i++) {
			System.out.print((a[i] - b[i]) + " ");
		}
	}
}
