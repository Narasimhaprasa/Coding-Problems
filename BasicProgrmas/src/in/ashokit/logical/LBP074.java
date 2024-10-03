package in.ashokit.logical;
/*Returns the middle character of a string

create a function that takes a string and returns, the middle character(s). if the word's length is odd return the midlle character. 
if the word's length is even, return the middle two characters.

input -----> a string from the user
constraint-> no
output ----> middle character(s)


Ex:
	prakash ----> k
	abc --------> b
	abcd -------> bc*/

import java.util.Scanner;

public class LBP074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word ::");
		String word = sc.nextLine();
		String result = checkStr(word);
		System.out.println(result);
	}

	public static String checkStr(String word) {
		char[] chr = word.toCharArray();
		int len = chr.length;
		String res = "";
		if (len % 2 == 0)
			return res = chr[len / 2 - 1] + "" + chr[len / 2];
		else
			return res = res + chr[len / 2];

	}

}
