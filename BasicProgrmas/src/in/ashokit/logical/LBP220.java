package in.ashokit.logical;

import java.util.Scanner;

/*identity matrix

Implement a program to check whether the given matrix is identity matrix or not

input -------> a 3x3 matrix
constraint --> no
output ------> Yes or No*/

public class LBP220 {

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
		boolean isTrue = printArray(a, row, column);
		System.out.println((isTrue == true) ? "Yes" : "No");

	}

	public static boolean printArray(int a[][], int row, int column) {
		int i, j;
		boolean flag = true;
		if ((row >= 1 && row <= 5) && (column >= 1 && column <= 5)) {
			for (i = 0; i < row; i++) {
				for (j = 0; j < column; j++) {
					if (i == j && a[i][j] != 1) {
						flag = false;
						break;
					}
					if (i != j && a[i][j] != 0) {
						flag = false;
						break;
					}
				}
			}
		}
		return flag;
	}

}
