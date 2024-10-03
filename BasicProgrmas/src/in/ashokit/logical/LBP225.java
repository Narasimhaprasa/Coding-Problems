package in.ashokit.logical;
/*sort all the elements in a matrix in asc order

Implement a program to sort all the elements in asc order in the matrix

input -------> a matrix
cons---------> no
output ------> result matrix*/

import java.util.Scanner;

public class LBP225 {

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
		int k = 0;
		int b[] = new int[row * column];
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				b[k++] = a[i][j];
			}
		}
		sort(b, b.length);
		k = 0;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				a[i][j] = b[k++];
			}
		}
		printArray(a, row, column);
	}

	public static void sort(int b[], int size) {
		int i, j, temp;
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (b[i] > b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
	}

	public static void printArray(int a[][], int row, int column) {
		int i, j;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
