package in.ashokit.logical;

import java.util.Scanner;

/*Sum of even indexed cols in matrix

Implement a program to find sum of even indexed cols in the given matrix.

input ------> a 3x3 matrix
con --------> no
output -----> sum as an int*/
public class LBP243 {

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
		int sum = printIndexBasedSum(a, row, column);
		System.out.println("EvenIndex column sum is ::" + sum);
	}

	public static int printIndexBasedSum(int a[][], int row, int column) {
		int i, j, sum = 0;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				if (j % 2 == 0)
					sum = sum + a[i][j];
			}
		}
		return sum;
	}

}
