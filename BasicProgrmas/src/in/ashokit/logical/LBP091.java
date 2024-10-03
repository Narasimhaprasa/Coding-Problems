package in.ashokit.logical;

import java.util.Scanner;

/*Replace Letters With Position In Alphabet

Create a function that takes a string and replaces each letter with its appropriate position in the alphabet. "a" is 1, "b" is 2, "c" is 3, etc, etc.

Note: If any character in the string isn't a letter, ignore it.

input -----------> a string from the user
constriant ------> non-empty string
output ----------> position of characters seperated by space

Ex:
	abcde ----> 1 2 3 4 5 
	xyz ------> 24 25 26*/

public class LBP091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:::");
		String word = sc.nextLine();
		String result = replaceCharWithPosition(word);
		System.out.println(result);
	}

	public static String replaceCharWithPosition(String word) {
		char[] chr = word.toCharArray();
		int i, len = chr.length;
		String res = "";
		for (i = 0; i < len; i++) {
			if (chr[i] >= 'A' && chr[i] <= 'Z') {
				chr[i] = (char) (chr[i] + 32);
			}
		}
		for (i = 0; i < len; i++) {
			if (chr[i] >= 'a' && chr[i] <= 'z') {
				res = res + " " + res.valueOf(chr[i] - 96);
			}
		}
		return res;
	}

}
