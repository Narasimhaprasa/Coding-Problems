package in.ashokit.logical;

import java.util.Scanner;

/*Matrix to Array

Implement a program to convert the given matrix into array

input -----> matrix of size mxn and elements
con -------> one D array is required
output ----> one-D array should be printed on screen

Ex:
	1 2 3
	4 5 6
	7 8 9

	1 2 3 4 5 6 7 8 9*/
public class LBP170 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row size::");
		int row = sc.nextInt();
		System.out.println("Enter a column size ::");
		int column = sc.nextInt();

		int[][] a = new int[row][column];
		System.out.println("Enter the array values ::");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				int value = sc.nextInt();
				a[i][j] = value;
			}
		}
		printArray(a, row, column);
	}

	public static void printArray(int a[][], int row, int column) {
		int i, j;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
	}

}
