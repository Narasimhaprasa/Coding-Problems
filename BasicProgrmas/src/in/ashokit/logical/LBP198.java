package in.ashokit.logical;

import java.util.Scanner;

/*token number

Write an algorithm to generate the token number from the application ID by doing this modifications.

R1. If the digit is even add 1 to it.
R2. If the digit is odd sub 1 from it.


input -----> a number from the user
con--------> no
output ----> token number

Ex:
	345 ---> 254

	345 ---> 543 --> 254*/
public class LBP198 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int num = sc.nextInt(), d;
		num = reverse(num);
		while (num != 0) {
			d = num % 10;
			if (d % 2 == 0)
				System.out.print(d + 1);
			else
				System.out.print(d - 1);
			num = num / 10;
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
