package in.ashokit.logical;

import java.util.Scanner;

/*print diagonal elements

Implement a program to read a matrix and display only diagonal elements.

input -------> a 3x3 matrix 
con ---------> no
output ------> print only diagonal elements*/
public class LBP239 {

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
		checkDiagonalMatrix(a, row, column);
	}

	public static void checkDiagonalMatrix(int a[][], int row, int column) {
		int i, j;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				if (i == j)
					System.out.print(a[i][j] + " ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
