package com.nt.programs;

import java.util.Scanner;

public class FlipMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row size::");
		int row = sc.nextInt();
		System.out.println("Enter a column size: ");
		int col = sc.nextInt();
		int i, j;
		/*int[][] arr = new int[row][col];
		System.out.println("Enter the values ::");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}*/
		 
		int[][] arr = { { 112, 42, 83, 119 }, { 56, 125, 56, 49 }, { 15, 78, 101, 43 }, { 62, 98, 114, 108 } };
		int res = FlipMatrix.filpingMatrix(arr, row, col);
		System.out.println(res);
	}

	public static int filpingMatrix(int[][] arr, int row, int column) {
		int i, j, k = 0, l = 2,sum;
		// to reverse column-2
		for (i = row - 1; i >= 2; i--) {
			for (j = 2; j <= 2; j++) {
				int temp = arr[k][2];
				arr[k][l] = arr[i][j];
				arr[i][j] = temp;
				k++;
			}
		}
		// to reverse row - 0
		k = 0;
		l = 0;
		for (i = 0; i < 1; i++) {
			for (j = row - 1; j >= 2; j--) {
				int temp = arr[k][l];
				arr[k][l] = arr[i][j];
				arr[i][j] = temp;
				l++;
			}
		}
		// to calculate sum subarray
		sum=0;
		for (i = 0; i < (row / 2); i++) {
			for (j = 0; j < (column / 2); j++) {
                    sum = sum + arr[i][j];
			}
		}
	printArray(arr, row, column);
		return sum;
	}

	public static void printArray(int[][] arr, int row, int column) {
		int i, j;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
