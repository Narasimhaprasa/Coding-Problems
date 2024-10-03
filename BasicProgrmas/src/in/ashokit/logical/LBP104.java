package in.ashokit.logical;

import java.util.Scanner;

/*sum of odd numbers in an array

Implement a program to read an array elements and print sum of all odd elements.

input -------> size of the array and array elements 
con ---------> size<100 
output ------> sum of all odd elements


Ex:
	6
	10 11 12 13 14 15
	39*/

public class LBP104 {

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

		int sum = sumOFOddValuesInArray(a, size);
		System.out.println("sum of odd values in array:::" + sum);
	}

	public static int sumOFOddValuesInArray(int a[], int size) {
		int i, sum = 0;
		for (i = 0; i < size; i++) {
			if (a[i] % 2 != 0)
				sum = sum + a[i];
		}
		return sum;
	}

}
