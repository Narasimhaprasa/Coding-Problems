package in.ashokit.logical;

import java.util.Scanner;

/*Replace character with it's occurrence

Implement a Program to replace a character with it's occurrence in given string.

input ---------> a string and a character from the user.
con -----------> non-empty string
output --------> replaced string

Ex:
	welcome, e -----> w1lcom2
	prakash,r ------> p1akash
	abababc,a ------> 1b2b3bc
*/
public class LBP092 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word ::");
		String word = sc.nextLine();
		System.out.println("Enter a character to replace with it position or occurance in the above String :::");
		String ch = sc.nextLine();

		String result = occurrenceCntStr(word, ch);
		System.out.println(result);
	}

	public static String occurrenceCntStr(String word, String ch) {
		char[] chr = word.toCharArray();
		int i, len = chr.length, count = 1;
		String res = "";
		for (i = 0; i < len; i++) {
			if (chr[i] == ch.charAt(0)) {
				res = res + count;
				count++;
			} else {
				res = res + chr[i];
			}
		}
		return res;
	}
}
