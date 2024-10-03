package in.ashokit.logical;
/*sum of all elements in array

Implement a program to read an array elements and print sum of all its elements.

input -------> size of the array and array elements 
con ---------> size<100 
output ------> sum of all elements

Ex:
	6
	10 11 12 13 14 15
	75*/

import java.util.Scanner;

public class LBP102 {

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

		int sum = sumOfElementsInArray(a, size);
		System.out.println("Sum of elements in array :: " + sum);

	}

	public static int sumOfElementsInArray(int a[], int size) {

		int i, sum = 0;
		for (i = 0; i < size; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

}
