package in.ashokit.logical;

import java.util.Scanner;

/*Sum of elements whose sum of row index and col index is odd

Implement a program to find sum of row index and col index is odd in the given matrix.

input ------> a 3x3 matrix
con --------> no
output -----> sum as an int
*/
public class LBP246 {

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
		System.out.println("Sum of elements even + odd index values  ::" + sum);
	}

	public static int printIndexBasedSum(int a[][], int row, int column) {
		int i, j, sum = 0;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				if ((i + j) % 2 != 0)
					sum = sum + a[i][j];
			}
		}
		return sum;
	}

}
