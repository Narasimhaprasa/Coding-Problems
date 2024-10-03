package in.ashokit.logical;

import java.util.Scanner;

/*First N Vowels

Write a function that returns the first n vowels of a string.

input ------> a string from the user and an integer value
cons -------> Return "invalid" if the n exceeds the number of vowels in a string.
output -----> return first n vowels in the string

Ex:
	welcome,1 -----> eoe ------> e
	welcome,2 -----> eoe ------> eo
	welcome,3 -----> eoe ------> eoe
	welcome,4 -----> eoe ------> invalid*/

public class LBP083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word ::");
		String word = sc.nextLine();
		System.out.println("Enter a n ::");
		int n = sc.nextInt();
		String result = checkVowelCount(word, n);
		System.out.println(result);

	}

	public static String checkVowelCount(String word, int n) {
		char[] chr = word.toCharArray();
		int i, len = chr.length, count = 0;
		String res = "";
		for (i = 0; i < len; i++) {
			if (chr[i] == 'a' || chr[i] == 'e' || chr[i] == 'i' || chr[i] == 'o' || chr[i] == 'u') {
				res = res + chr[i];
				count++;
			}
		}
		if (n <= res.length()) {
			return res.substring(0, n);
		} else
			return "invalid";
	}

}
