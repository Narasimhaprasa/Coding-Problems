package in.ashokit.logical;
/*max element in matrix

Implement a program to print max element in an matrix

input -----> a 3x3 matrix
constraint-> no
output ----> max element in matrix*/

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class LBP213 {

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
		int res = printArray(a, row, column);
		System.out.println("maximum element in matrix:: ::" + res);

	}

	public static int printArray(int a[][], int row, int column) {
		int i, j, max = a[0][0];
		if ((row >= 1 && row <= 5) && (column >= 1 && column <= 5)) {
			for (i = 0; i < row; i++) {

				for (j = 0; j < column; j++) {
					if (max < a[i][j])
						max = a[i][j];
				}
			}
		}
		return max;
	}
	/*public static int printArray(int a[][], int row, int column) {
		int i, j, max = a[0][0];
		Stack<Integer> s = new Stack<Integer>();
		if ((row >= 1 && row <= 5) && (column >= 1 && column <= 5)) {
			for (i = 0; i < row; i++) {
	
				for (j = 0; j < column; j++) {
					s.push(a[i][j]);
				}
			}
		}
		Collections.sort(s);
		//return s.lastElement();
		return s.get(row * column - 1);
	}*/

}
