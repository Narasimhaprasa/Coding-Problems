package in.ashokit.logical;

import java.util.Scanner;

/*Sum of prime elements 

Implement a program to find sum of prime elements in the given matrix.

input ------> a 3x3 matrix
con --------> no
output -----> sum as an int*/
public class LBP247 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row size::");
		int row = sc.nextInt();
		System.out.println("Enter the column size ::");
		int column = sc.nextInt();

		int a[][] = new int[row][column], i, j;
		System.out.println("Enter the array values ::");
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				int value = sc.nextInt();
				a[i][j] = value;
			}
		}
		int sum = printPrimeNumbersSum(a, row, column);
		System.out.println("sum of prime numbers in a given matrix::" + sum);
	}

	public static int printPrimeNumbersSum(int a[][], int row, int column) {
		int i, j, sum = 0;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				if (isPrime(a[i][j]))
					sum = sum + a[i][j];
			}
		}
		return sum;
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
