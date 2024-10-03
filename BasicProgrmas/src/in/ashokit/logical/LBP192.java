package in.ashokit.logical;

import java.util.Scanner;

/*digits raised to the third power

Cristina appeared for a corporate Hackathon. She cleared first round of this and would like to take next challenge which is coding round. 
The problem statement comes to her is

"Write a program to find numbers which are in between integer 2 and integer N and such that the sum of its digits raised
 to the third power is equal to the number with the input given.

input ----> integer N
con ------> no
output ---> an integer value

Ex:
	123 = 1^3 + 2^3 + 3^3 = 1 + 8 + 27 = 36
	153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
*/
public class LBP192 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int num = sc.nextInt();
		for (int i = 2; i <= num; i++) {
			if (i == sum(num)) {
				System.out.println(i);
				break;
			}
		}
	}

	public static int sum(int n) {
		int remainder, sum = 0;
		while (n != 0) {
			remainder = n % 10;
			sum = sum + remainder * remainder * remainder;
			n = n / 10;
		}
		return sum;
	}
}
