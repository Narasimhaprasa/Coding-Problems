package in.ashokit.logical;

import java.util.Scanner;

/*Reverse of each element in matrix

Implement a program to reverse each element in the matrix.

input ------> a 3x3 matrix
con --------> no
output -----> result matrix
*/
public class LBP249 {

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
		printEachElementInReverse(a, row, column);
	}

	public static void printEachElementInReverse(int a[][], int row, int column) {
		int i, j;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.print(reverse(a[i][j]) + " ");
			}
			System.out.println();
		}
	}

	public static int reverse(int n) {
		int remainder, reverse = 0;
		while (n != 0) {
			remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
		}
		return reverse;
	}
}
