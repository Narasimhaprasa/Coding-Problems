package in.ashokit.logical;

import java.util.Scanner;

/*two matrices are equal or not

Implement a program to check whether the given matrices are equal or not

input -------> a 3x3 matrix
constraint --> no
output ------> Yes or No*/

public class LBP221 {

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
		boolean isTrue = printArray(a, b, row, column);
		System.out.println((isTrue == true) ? "Yes" : "No");

	}

	public static boolean printArray(int a[][], int b[][], int row, int column) {
		int i, j;
		boolean flag = true;
		if ((row >= 1 && row <= 5) && (column >= 1 && column <= 5)) {
			for (i = 0; i < row; i++) {
				for (j = 0; j < column; j++) {
					if (a[i][j] != b[i][j]) {
						flag = false;
						break;
					}
				}
			}
		}
		return flag;
	}

}
