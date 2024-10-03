package in.ashokit.logical;
/*All Numbers In Array Are Prime

Create a function thats takes an array of integers and returns true if every number is prime. Otherwise, return false.

input -------> size and an array
con ---------> 1 is not a prime number.
output ------> true or false


Ex:
    5
    2 3 4 5 6
    false

    5
    2 3 5 7 11
    true*/

import java.util.Scanner;

public class LBP150 {

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
		checkAllElementsPrimeOrNot(a, size);
	}

	public static void checkAllElementsPrimeOrNot(int a[], int size) {
		int i, count = 0;
		for (i = 0; i < size; i++) {
			if (isPrime(a[i]))
				count++;
		}
		if (count == size)
			System.out.println("true");
		else
			System.out.println("false");
	}

	public static boolean isPrime(int num) {
		int i, f = 0;
		for (i = 1; i <= num; i++) {
			if (num % i == 0)
				f++;
		}
		return f == 2;
	}
}
