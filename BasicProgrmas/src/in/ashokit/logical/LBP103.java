package in.ashokit.logical;

import java.util.Scanner;

/*sum of even numbers in an array

Implement a program to read an array elements and print sum of all even elements.

input -------> size of the array and array elements 
con ---------> size<100 
output ------> sum of all even elements

Ex:
	6
	10 11 12 13 14 15
	36*/
public class LBP103 {

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
		int result = sumOfEvenValuesInArray(a, size);
		System.out.println("Sum of even values in array:::" + result);
	}

	public static int sumOfEvenValuesInArray(int a[], int size) {
		int i, sum = 0;
		for (i = 0; i < size; i++) {
			if (a[i] % 2 == 0)
				sum = sum + a[i];
		}
		return sum;
	}
}
