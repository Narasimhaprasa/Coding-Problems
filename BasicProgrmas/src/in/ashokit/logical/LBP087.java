package in.ashokit.logical;

import java.util.Scanner;

/*Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses
 *  string is valid.
Formally, a parentheses string is valid if and only if:
It is the empty string, or It can be written as AB (A concatenated with B), where A and B are valid strings, or It can be written as (A), where A is a valid string. 
Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.

input --------> string from the user
constraint ---> non-empty string
output -------> minimum number of ( or ) required.

Ex:
	()	0
	((	2
	(()	1*/
public class LBP087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string only parentheses::");
		String s = sc.nextLine();
		int result = checkParentheses(s);
		System.out.println(result);
	}

	public static int checkParentheses(String s) {
		char[] chr = s.toCharArray();
		int i, len = chr.length, openPth = 0, closePth = 0;
		for (i = 0; i < len; i++) {
			if (chr[i] == '(')
				openPth++;
			if (chr[i] == ')')
				closePth++;
		}
		return Math.abs(openPth - closePth);
	}

}
