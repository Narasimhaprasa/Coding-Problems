package in.ashokit.logical;

import java.util.Scanner;

/*sort all the elements in a column in asc order

Implement a program to sort all the column values in asc order

input -------> a matrix
cons---------> no
output ------> result matrix*/

public class LBP229 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row size ::");
		int row = sc.nextInt();
		System.out.println("Enter a column size ::");
		int column = sc.nextInt(), i, j, k, temp;
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
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				b[i][j] = a[j][i];
			}
		}

		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				for (k = j + 1; k < row; k++) {
					if (b[i][j] > b[i][k]) {
						temp = b[i][j];
						b[i][j] = b[i][k];
						b[i][k] = temp;
					}
				}
			}
		}
		printArray(b, row, column);
}

	public static void printArray(int a[][], int row, int column) {
		int i, j;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
