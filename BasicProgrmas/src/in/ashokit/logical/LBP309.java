package in.ashokit.logical;
/*Write a program to find nearest greater paliandrome 

input ---------> an integer value
constraint ----> n>0
output --------> print nearest paliandrome value*/

import java.util.Scanner;

public class LBP309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ::");
		int n = sc.nextInt();

		while (true) {
			if (n == reverse(n)) {
				System.out.println(n);
				break;
			}
			n++;
		}
	}

	public static int reverse(int n) {
		int remainder, reverse = 0;
		while (n != 0) {
			remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
		}
		return reverse;
	}
}
