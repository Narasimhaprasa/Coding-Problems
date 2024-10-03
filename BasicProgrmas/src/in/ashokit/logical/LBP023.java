package in.ashokit.logical;

import java.util.Scanner;

/*A Special two digit number

A special two digit number is a number such that when the sum of its digits is added to the product of its digits, 
the result should be equal to the original two-digit number.

Implement a program to accept a two digit number and check whether it is a special two digit number or not.

input -----> a two digit number
constraint-> 10<=n<=99
output ----> special two digit number or not
*/
public class LBP023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two digit number ::");
		int num = sc.nextInt(), a, b, c;
		if (num >= 10 && num <= 99) {
			a = num % 10;
			b = (num / 10) % 10;
			c = (a + b) + (a * b);
			System.out.println((c == num) ? "Yes" : "No");
		}

	}

}
