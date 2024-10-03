package in.ashokit.logical;

import java.util.Scanner;

/*Fanny is given a string along with the string which contains single character x. She has to remove the character x from the given string.
 *  Help her write a program to remove all occurrences of x character from the given string.

input ---------> String and character from the user 
constraint ----> non-empty string
output --------> Updated string

Ex:
	welcome, e ------> wlcom
	prakash, a ------> prksh*/
public class LBP085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word ::");
		String word = sc.nextLine();
		System.out.println("Enter a character whichh removed from the given String ::");
		String occ = sc.nextLine();

		String res = removeOccurrences(word, occ);
		System.out.println(res);

	}

	public static String removeOccurrences(String word, String ch) {
		char[] chr = word.toCharArray();
		int i, len = chr.length;
		String res = "";
		for (i = 0; i < len; i++) {
			if (chr[i] == ch.charAt(0))
				continue;
			else
				res = res + chr[i];
		}
		return res;
	}

}
