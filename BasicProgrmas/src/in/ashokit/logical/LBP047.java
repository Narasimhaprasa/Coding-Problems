package in.ashokit.logical;

import java.util.Scanner;

/*Oddish or Evenish

Create a function that determines whether a number is Oddish or Evenish. A number is Oddish if the sum of all of its digits is Odd, 
and number is Evenish if the sum of all of its digits is even, if a number is Oddish return Oddish else return Evenish.

input ----------> a number
constraint -----> n>0
output ---------> Oddish or Evenish
*/
public class LBP047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number::");
		int num = sc.nextInt();

		int checkNum = checkNum(num);
		System.out.println((checkNum % 2 == 0) ? "Evenish" : "Oddish");

	}

	public static int checkNum(int num) {
		int remainder, sum = 0;
		while (num != 0) {
			remainder = num % 10;
			sum = sum + remainder;
			num = num / 10;
		}
		return sum;
	}

}
