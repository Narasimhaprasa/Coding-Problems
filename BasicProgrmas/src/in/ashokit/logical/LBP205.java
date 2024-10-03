package in.ashokit.logical;

import java.util.Scanner;

/*sum of all prime elements

Write a program to find sum of all prime elements in the matrix.

input --------> a 3x3 matrix
constriants --> no
output -------> sum of all prime elements*/
public class LBP205 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row size ::");
		int row = sc.nextInt();
		System.out.println("Enter a column size ::");
		int column = sc.nextInt(), i, j;
		int a[][] = new int[row][column];
		System.out.println("Enter the values ::");
		if ((row >= 1 && row <= 5) && (column >= 1 && column <= 5)) {
			for (i = 0; i < row; i++) {
				for (j = 0; j < column; j++) {
					int value = sc.nextInt();
					a[i][j] = value;
				}
			}
		} else {
			System.out.println("Enter a row and column in between 1 to 5 ");
		}
		int sum = printArray(a, row, column);
		System.out.println(sum);
	}

	public static int printArray(int a[][], int row, int column) {
		int i, j, sum = 0;
		if ((row >= 1 && row <= 5) && (column >= 1 && column <= 5)) {
			for (i = 0; i < row; i++) {
				for (j = 0; j < column; j++) {
					if (isPrime(a[i][j]))
						sum = sum + a[i][j];
				}
			}
		}
		return sum;
	}

	public static boolean isPrime(int n) {
		int i, f = 0;
		for (i = 1; i <= n; i++) {
			if (n % i == 0)
				f++;
		}
		return f == 2;
	}

}
