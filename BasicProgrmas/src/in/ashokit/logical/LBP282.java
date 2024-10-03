package in.ashokit.logical;

import java.util.Scanner;

/*Happy Number

The happy number can be defined as a number which will yield 1 when it is replaced by the sum of the square of its digits repeatedly. 
If this process results in an endless cycle of numbers containing 4, then the number is called an unhappy number.

Write a program that accepts a number and determines whether the number is a happy number or not. Return true if so, false otherwise.

input -----> a number from the user
con -------> no
output ----> true or false

Ex:
    16=1+36=37=9+49=58=25+64=89....................4 false
    32=9+4=13=1+9=10=1+0=1 true*/
public class LBP282 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Happy number ::");
		int num = sc.nextInt();

		while (true) {
			if (num >= 0 && num <= 9) {
				if (num == 1) {
					System.out.println(true);
					break;
				} else {
					System.out.println(false);
					break;
				}
			} else {
				num = sum(num);
			}
		}
	}

	public static int sum(int n) {
		int remainder, sum = 0;
		while (n != 0) {
			remainder = n % 10;
			sum = sum + remainder * remainder;
			n = n / 10;
		}
		return sum;
	}
}
