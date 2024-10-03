package in.ashokit.logical;

import java.util.Scanner;

public class LBP234 {

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

		swapArrayRow(a, row, column);
	}

	public static void swapArrayRow(int a[][], int row, int column) {
		int i, j, temp;
		for (i = 0; i < row; i++) {
			temp = a[i][i];
			a[i][i] = a[i][row - i - 1];
			a[i][row - i - 1] = temp;
		}

		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
