package in.ashokit.logical;

import java.util.Scanner;

/*factorial game

Mikes likes to play with numbers. His friends are also good with numbers and often plays mathematical games. they made a small game
 where they will spell the last digit of a factorial of a number other than 0.

Let say the given number is 5, so 5! will be 120, Here 0 is the last digit. But we dn't want 0, we want a number other than 0. Then last digit is 2.

input ----> an integer value
con ------> no
output ---> an integer vlaue

Ex:
    4! = 24 ----> 4
    5! = 120 ---> 2*/
public class LBP260 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to play a game ::");
		int num = sc.nextInt();
		findFactorial(num);
	}

	public static void findFactorial(int num) {
		int i, fact = 1;
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		int res = findDigit(fact);
		System.out.println(res);
	}

	public static int findDigit(int fact) {
		int remainder, specialDigit = 0;
		while (fact != 0) {
			remainder = fact % 10;
			if (remainder != 0) {
				specialDigit = remainder;
				break;
			}
			fact = fact / 10;
		}
		return specialDigit;
	}
}
