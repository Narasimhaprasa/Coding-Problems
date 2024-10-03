package in.ashokit.logical;

import java.util.Scanner;

/*absolute difference

Write a program to find the absolute difference between 
the original number and its reserved number.

input -----> a number from the user
con -------> no
output ----> absolute difference

Logic:
	n-rev(n)*/
public class LBP189 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:::");
		int num = sc.nextInt();
		int reverse = reverse(num);
		System.out.println(Math.abs(num - reverse));
	}

	public static int reverse(int num) {
		int remainder, reverse = 0;
		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		return reverse;
	}
}
