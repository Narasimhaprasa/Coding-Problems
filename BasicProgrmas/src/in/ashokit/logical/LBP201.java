package in.ashokit.logical;
/*Program to read matrix elements of order n x m and display on the console.

input ---------> A matrix of order n x m. 
constraint ----> 1<=n<=5 and 1<=m<=5
output --------> Print the same matrix

Ex:
	3
	3
	1 2 3
	4 5 6
	7 8 9

	output:
	1 2 3
	4 5 6 
	7 8 9*/

import java.util.Scanner;

public class LBP201 {

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
		printArray(a, row, column);
	}

	public static void printArray(int a[][], int row, int column) {
		int i, j;
		if ((row >= 1 && row <= 5) && (column >= 1 && column <= 5)) {
			for (i = 0; i < row; i++) {
				for (j = 0; j < column; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
