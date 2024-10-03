package in.ashokit.logical;

import java.util.Scanner;

/*sum of elements in an array ending with 3

Implement a program to read an array elements and print sum of elements ending with 3 in array.

input -------> size of the array and array elements 
con ---------> size<100 
output ------> sum of elements ending with 3

Ex:
	6
	10 11 12 13 14 15
	13
*/

public class LBP108 {

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
		int res = sumOfEndWithThreeInArray(a, size);
		System.out.println("sum of numbers ending with three digit in a given array ::" + res);
	}

	public static int sumOfEndWithThreeInArray(int a[], int size) {

		int i, sum = 0;
		for (i = 0; i < size; i++) {
			if (a[i] % 10 == 3)
				sum = sum + a[i];
		}
		return sum;
	}

}
