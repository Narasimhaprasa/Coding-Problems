package in.ashokit.logical;

import java.util.Scanner;

/*Symmetric matrix

Implement a program to read a matrix and check whether the given matrix is symmertric matrix or not

input -------> a 3x3 matrix 
con ---------> no
output ------> Yes or No
*/
public class LBP238 {

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
		checkScalarMatrix(a, row, column);
	}

	public static void checkScalarMatrix(int a[][], int row, int column) {
		int i, j, count = 0;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				if (a[i][j] == a[j][i])
					count++;
			}
		}
		System.out.println((count == row * column) ? "Yes" : "No");
	}
}
