package in.ashokit.logical;

import java.util.Scanner;

/*Validate ATM PIN

Implement a program that will test if a string is a valid PIN or not via a regular expression.

A valid PIN has:

Exactly 4 characters.
Only numeric characters (0-9).
No whitespace.

input ----> an input from the user
con ------> con
output ---> true or false
*/
public class LBP280 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ATM pin ::");
		String pin = sc.nextLine();
		int i, len = pin.length(), count = 0;
		for (i = 0; i < len; i++) {
			if (pin.charAt(i) >= '0' && pin.charAt(i) <= '9')
				count++;
		}
		//System.out.println((count == 4) ? "True" : "False");
		System.out.println(count == 4);
	}

}
