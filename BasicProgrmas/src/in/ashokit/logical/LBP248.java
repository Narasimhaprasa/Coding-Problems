package in.ashokit.logical;

import java.util.Scanner;

/*Count of prime digits in the given matrix

Implement a program to count number of prime digits present in the matrix.

input ------> a 3x3 matrix
con --------> no
output -----> prime digits count*/
public class LBP248 {

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
		int sum = findPrimeDigitCount(a, row, column);
		System.out.println("prime digits count in the given matrix ::" + sum);
	}

	public static int findPrimeDigitCount(int a[][], int row, int column) {
		int i, j, sum = 0;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				sum = sum + count(a[i][j]);
			}
		}
		return sum;
	}

	public static int count(int n) {
		int i, cnt = 0, remainder;
		while (n != 0) {
			remainder = n % 10;
			if (remainder == 2 || remainder == 3 || remainder == 5 || remainder == 7)
				cnt++;
			n = n / 10;
		}
		return cnt;
	}
}
