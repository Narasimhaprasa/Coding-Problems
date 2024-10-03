package in.ashokit.logical;

import java.util.Scanner;

/*Write a program to find whether the given string is lucky or not, 
A string is said to be lucky if the sum of ascii values of the characters in the string is even.

input ------> a string
con --------> non empty string
output -----> true or false
*/
public class LBP299 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ::");
		String word = sc.nextLine();
		int i, len = word.length(), sum = 0;
		for (i = 0; i < len; i++) {
			sum = sum + word.charAt(i);
		}
		System.out.println(sum % 2 == 0);
	}

}
