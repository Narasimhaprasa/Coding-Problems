package in.ashokit.logical;

import java.util.Scanner;

/*Sum of All Integers

Implement a program to find sum of all integers between two integer numbers taken as input and are divisible by 7.


input ------> an integer value
con --------> no
output -----> sum value*/

public class LBP274 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a n1 value ::");
		int n1 = sc.nextInt();
		System.out.println("Enter a n2 value ::");
		int n2 = sc.nextInt();
		int res = findSum(n1, n2);
		System.out.println(res);
	}

	public static int findSum(int n1, int n2) {
		int i, sum = 0;
		for (i = n1; i <= n2; i++) {
			if (i % 7 == 0)
				sum = sum + i;
		}
		return sum;
	}
}
