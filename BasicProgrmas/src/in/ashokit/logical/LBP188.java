package in.ashokit.logical;

import java.util.Scanner;

/*digital root

Write a program to find the digital root of a given number. 
Digital root is the recursive sum of digits in the given number (until single digit is arrived)

input ----> a number from the user
con ------> no
output ---> single digit number

Ex:
	12345 ---> 15 ---> 6
*/
public class LBP188 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int num = sc.nextInt();
		findDigitialRoot(num);
	}

	public static void findDigitialRoot(int num) {
		while (true) {
			if (num >= 0 && num <= 9) {
				System.out.print(num);
				break;
			}
			num = sum(num);
		}
	}

	public static int sum(int n) {
		int remainder, sum = 0;
		while (n != 0) {
			remainder = n % 10;
			sum = sum + remainder;
			n = n / 10;
		}
		return sum;
	}
}
