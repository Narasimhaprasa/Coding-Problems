package in.ashokit.logical;

import java.util.Scanner;

/*Scalar matrix multiplication

Implement a program to read a matrix and multiplier and return scalar matrix multiplication.

input -------> a 3x3 matrix and multiplier
con ---------> no
output ------> resultent matrix*/

public class LBP237 {

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
		System.out.println("Enter the m value ::");
		int m = sc.nextInt();
		printScalarMatrixMultiplication(a, row, column, m);
	}

	public static void printScalarMatrixMultiplication(int a[][], int row, int column, int m) {
		int i, j;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.print((a[i][j] * m) + " ");
			}
			System.out.println();
		}
	}
}
