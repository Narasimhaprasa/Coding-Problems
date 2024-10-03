package in.ashokit.logical;
/*Online Game

You are playing an online game. In the game, a numbers is displayed on the screen. In order to win the game, you have to count the trailing zeros in the 
factorial value of the given number. Write an algorithm to count the trailing zeros in the factorial value of the given number.

input ------> an integer num, representing the number displayed on the screen.
con---------> no
output -----> the count of trailing zeros in the factorial of the given number.

Ex:
	5 = 120 ---> 1
	4 = 24 ----> 0*/

import java.util.Scanner;

public class LBP167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int num = sc.nextInt();
		checkFactorialOfNum(num);
	}

	public static void checkFactorialOfNum(int num) {
		int i, f = 1;
		for (i = 1; i <= num; i++) {
			f = f * i;
		}
		int count = count(f);
		System.out.println(count);
	}

	public static int count(int f) {
		int remainder, count = 0;
		while (f != 0) {
			remainder = f % 10;
			if (remainder == 0)
				count++;
			f = f / 10;
		}
		return count;
	}
}
