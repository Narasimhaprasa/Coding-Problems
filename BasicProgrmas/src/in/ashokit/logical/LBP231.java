package in.ashokit.logical;
/*sparse matrix

Implement a program to check whether the given matrix is sparse matrix or not.
Note: a sparse matrix is a matrix with the majority of its elements equal to zero.

input---------> a matrix
con ----------> no
output -------> Yes or No*/

import java.util.Scanner;

public class LBP231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row size ::");
		int row = sc.nextInt();
		System.out.println("Enter a column size ::");
		int column = sc.nextInt(), i, j, count = 0;
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

		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				if (a[i][j] == 0)
					count++;
			}
		}
		System.out.println((count >= 5) ? "Yes" : "No");
	}

}
