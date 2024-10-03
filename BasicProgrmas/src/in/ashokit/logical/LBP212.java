package in.ashokit.logical;

import java.util.Scanner;

/*find the product of opposite diagonal matrix

Write a program to find the product of opposite diagonal matrix.

input --------> a 3x3 matrix
constriants --> no
output -------> find the product of opposite diagonal matrix*/
public class LBP212 {

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
		int res = printArray(a, row, column);
		System.out.println("product of digonal elements ::" + res);

	}

	public static int printArray(int a[][], int row, int column) {
		int i, j, product = 1;
		if ((row >= 1 && row <= 5) && (column >= 1 && column <= 5)) {
			for (i = 0; i < row; i++) {
				product = product * a[i][row - i - 1];
			}
		}
		return product;
	}

}
