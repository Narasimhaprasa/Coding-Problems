package in.ashokit.logical;

import java.util.Scanner;

/*Square of Each Element of Matrix

Implement a program to find square of each element present in a matrix.

input -------> a 3x3 matrix 
con ---------> no
output ------> resultent matrix*/
public class LBP240 {

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
		checkSquareMatrix(a, row, column);
	}

	public static void checkSquareMatrix(int a[][], int row, int column) {
		int i, j;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.print((a[i][j] * a[i][j]) + " ");
			}
			System.out.println();
		}
	}
}
