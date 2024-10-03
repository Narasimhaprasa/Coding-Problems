package in.ashokit.logical;

import java.util.Scanner;

/*sum of palindrome numbers in an array

Implement a program to read an array elements and print sum of all palindrome numbers in array.

input -------> size of the array and array elements 
con ---------> size<100 
output ------> sum of all palindrome numbers

Ex:
	6
	10 11 12 13 14 15
	11*/

public class LBP106 {

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

		int sum = sumOfPalindromeNumbersInArray(a, size);
		System.out.println("sum of palindrome numbers in array ::" + sum);
	}

	public static int sumOfPalindromeNumbersInArray(int a[], int size) {
		int i, sum = 0;
		for (i = 0; i < size; i++) {
			if (a[i] == isPalindrome(a[i]))
				sum = sum + a[i];
		}
		return sum;
	}

	public static int isPalindrome(int num) {
		int remainder, reverse = 0;
		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		return reverse;
	}

}
