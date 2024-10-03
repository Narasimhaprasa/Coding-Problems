package in.ashokit.logical;

import java.util.Scanner;

/*Space between each character

Create a function that takes a string and returns a string with spaces in between all of the characters.

input ------------> a string
constraints-------> No
output -----------> string

Ex:
	welcome ----> w e l c o m e
	java -------> j a v a
	prakash ----> p r a k a s h*/

public class LBP070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word::");
		String word = sc.nextLine();
		String result = spaceBetweenEachChar(word);
		System.out.println(result);
	}

	public static String spaceBetweenEachChar(String word) {
		int i, len = word.length();
		String res = "";
		for (i = 0; i < len; i++) {
			res = res + word.charAt(i) + " ";
		}
		return res;
	}

}
