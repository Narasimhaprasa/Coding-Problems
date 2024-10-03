package in.ashokit.logical;

import java.util.Scanner;

/*Oddly Even

Given a maximum of 100 digit numbers as input, 
find the difference between the sum of odd and even position digits.

input ------> a number from the user
con --------> no
output -----> an integer

Ex:
	1234
	0123

	so = 2 + 4 = 6
	se = 1 + 3 = 4
	so-se = 6-4 = 2*/
public class LBP172 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int num = sc.nextInt();
		int i = 0, so = 0, d, se = 0;
		num = reverse(num);
		while (num != 0) {
			d = num % 10;
			if (i % 2 == 0)
				se = se + d;
			else
				so = so + d;
			i++;
			num = num / 10;
		}
		System.out.println(so - se);
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
