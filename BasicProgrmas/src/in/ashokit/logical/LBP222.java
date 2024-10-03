package in.ashokit.logical;
/*addition of two matrices

Write a program to perform addition operation on two matrices

input --------> two 3x3 matrices
constraint----> no
output -------> resultent matrix*/

import java.util.Scanner;

public class LBP222 {

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
		int b[][] = new int[row][column];
		System.out.println("Enter a b array ::");
		if ((row >= 1 && row <= 5) && (column >= 1 && column <= 5)) {
			for (i = 0; i < row; i++) {
				for (j = 0; j < column; j++) {
					int value = sc.nextInt();
					b[i][j] = value;
				}
			}
		} else {
			System.out.println("Enter a row and column in between 1 to 5 ");
		}
		printArray(a, b, row, column);

	}

	public static void printArray(int a[][], int b[][], int row, int column) {
		int i, j;
		int c[][] = new int[row][column];
		if ((row >= 1 && row <= 5) && (column >= 1 && column <= 5)) {
			for (i = 0; i < row; i++) {
				for (j = 0; j < column; j++) {
					c[i][j] = a[i][j] + b[i][j];
				}
			}
		}
		printElements(c, row, column);
	}

	public static void printElements(int c[][], int row, int column) {
		int i, j;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.print(c[i][j] + " ");
			}
		}
	}

}
