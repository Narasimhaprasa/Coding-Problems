package in.ashokit.logical;

import java.util.Scanner;

/*check if String ending matches second String

Create a function/method that takes two Strings and returns true of the first string ends with second string, otherwise return false.

Input:  two strings
Constraints: No 
Output: true or false

Ex:
    computer, ter ----> true
    computer, ing ----> false*/

public class LBP055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word ::");
		String word = sc.nextLine();
		System.out.println("Enter a suffix in a given word " + word);
		String suffix = sc.nextLine();

		boolean isTrue = matchString(word, suffix);
		System.out.println((isTrue == true) ? "Match is same " : "Match is not same");
	}

	public static boolean matchString(String word, String suffix) {
		int i, length = word.length();
		String res = "";
		for (i = length - 3; i < length; i++) {
			res = res + word.charAt(i);
		}

		if (res.equals(suffix))
			return true;
		else
			return false;
	}

}
