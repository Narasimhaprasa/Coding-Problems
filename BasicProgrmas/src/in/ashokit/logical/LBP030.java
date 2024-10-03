package in.ashokit.logical;
/*Valid Palindrome

Given a string, determine if it is a Palindrome string or not. A String is Palindrome if it is equal to reverse of the original string.

input ------> A String from the user
constriant--> Non-empty String
output -----> Palindrome or not*/

import java.util.Scanner;

public class LBP030 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ::");
		String str = sc.nextLine(), reverse = "";
		char[] chr = str.toCharArray();

		for (int i = chr.length-1; i >= 0; i--) {
			reverse = reverse + chr[i];

		}
		 
		if(reverse.equals(str))
			System.out.println("It is a palindrome string");
		else
			System.out.println("It is not a palindrome string");

	}

}
