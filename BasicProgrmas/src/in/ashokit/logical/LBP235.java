package in.ashokit.logical;
/*upper triangular matrix

Program to accept a matrix and check whether it is upper triangular matrix or not

input -------> a 3x3 matrix 
con ---------> no
output ------> Yes or No

1 2 3
0 5 6
0 0 7  Yes

1 2 3 
4 5 6
0 0 7  No*/

import java.util.Scanner;

public class LBP235 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row size ::");
     int row = sc.nextInt();
		System.out.println("Enter a column size ::");
		int column = sc.nextInt(), i, j, m, n;
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
		findTriangularMatrix(a, row, column);
	}

	public static void findTriangularMatrix(int a[][], int row, int column) {
		int i, j;
		boolean flag = true;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				if (i > j && a[i][j] != 0) {
					flag = false;
					break;
				}
			}
		}
		System.out.println((flag == true) ? "Yes" : "No");
	}
}
