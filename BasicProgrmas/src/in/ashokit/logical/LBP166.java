package in.ashokit.logical;

import java.util.Scanner;

/*Sales Report

a company has a sales record of N products for M days. 
The company wishes to know the maximum revenue received from a given product of the N products each day. 
Write an algorithm to find the higest revenue received each day.

input -----> space seperated integers N and M.
con -------> no
output ----> M space seperated integers representing the maximum received each day.
*/
public class LBP166 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of products ::");
		int n = sc.nextInt();
		System.out.println("Enter a number of days ::");
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int value = sc.nextInt();
				a[i][j] = value;
			}
		}
		maximumRevenue(a, n, m);
	}

	public static void maximumRevenue(int a[][], int n, int m) {
		int i, j, max;
		for (i = 0; i < n; i++) {
			max = a[i][0];
			for (j = 0; j < m; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
				}
			}
			System.out.println(max);
		}

	}
}
