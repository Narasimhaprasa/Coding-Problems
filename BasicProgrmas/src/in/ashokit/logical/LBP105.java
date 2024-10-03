package in.ashokit.logical;

import java.util.Scanner;

/*LBP105

sum of prime numbers in an array


Implement a program to read an array elements and print sum of all prime elements.

input -------> size of the array and array elements 
con ---------> size<100 
output ------> sum of all prime elements

Ex:
	6
	10 11 12 13 14 15
	24
*/

public class LBP105 {

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
		int sum = sumOfPrimeValuesInArray(a, size);
		System.out.println("Sum of prime numbers in array ::" + sum);
	}

	public static int sumOfPrimeValuesInArray(int a[], int size) {

		int i, sum = 0;
		for (i = 0; i < size; i++) {
			if (isPrime(a[i]))
				sum = sum + a[i];
		}
		return sum;
	}

	public static boolean isPrime(int n) {
		int i, f = 0;
		for (i = 1; i <= n; i++) {
			if (n % i == 0)
				f++;
		}
		return (f == 2) ? true : false;
	}
}
