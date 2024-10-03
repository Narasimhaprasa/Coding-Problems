package in.ashokit.logical;
/*Double Letters

Create a function that takes a word and returns true if the word has two consecutive identical letters.

input ---------> A string
constraint-----> No
output --------> true or false

Ex:
	welcome -----> false
	cool --------> true
	java --------> false
	coffee ------> true*/

import java.util.Scanner;

public class LBP067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  word ::");
		String word = sc.nextLine();
		boolean isTrue = checkConsecutiveChars(word);
		System.out.println((isTrue == true) ? "true" : "false");
	}

	public static boolean checkConsecutiveChars(String word) {
		char[] chr = word.toCharArray();
		int i, len = chr.length;
		boolean falg = false;
		for (i = 0; i < len - 1; i++) {
			if (chr[i] == chr[i + 1]) {
				falg = true;
				break;
			}
		}
		return falg;
	}

}
