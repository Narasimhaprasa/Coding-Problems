package in.ashokit.logical;

import java.util.Scanner;

/*Keep paliandrome number and replace remaining with 0's

Implement a program to keep all paliandrome numbers as it is and replace remaining with 0.

input ------> a 3x3 matrix
con --------> no
output -----> result matrix*/
public class LBP250 {

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
		printPalindromeNumbers(a, row, column);
	}

	public static void printPalindromeNumbers(int a[][], int row, int column) {
		int i, j;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				if (a[i][j] == isPalindrome(a[i][j]))
					System.out.print(a[i][j] + " ");
				else
					System.out.print("0" + " ");
			}
			System.out.println();
		}
	}

	public static int isPalindrome(int num) {
		int remainder, reverse = 0;
		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		return reverse;
	}
}
