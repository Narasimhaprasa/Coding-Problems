package in.ashokit.logical;

import java.util.Scanner;

/*Re-form the word

A word has been split into a left part and right part. 
Re-form the word by adding both halves together changing the first to an uppercase letter.

input ---------> two strings from the user
constraint ----> no
output --------> concatenated string with caps in first character


Ex:
    s1 = "hello"
    s2 = "prakash"

    o/p: Helloprakash*/

public class LBP058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first word:");
		String s1 = sc.nextLine();
		System.out.println("Enter a second word ::");
		String s2 = sc.nextLine();
		String result = reformWord(s1, s2);
		System.out.println(result);
		//System.out.println(s1.substring(0, 1).toUpperCase() + s1.substring(1) + s2);
	}

	public static String reformWord(String s1, String s2) {

		char[] chr = s1.toCharArray();
		int i;
		String res = "";
		for (i = 0; i < chr.length; i++) {
			if (chr[0] >= 'a' && chr[0] <= 'z') {
				chr[0] = (char) (chr[0] - 32);
			}
		}
		for (i = 0; i < chr.length; i++) {
			res = res + chr[i];
		}
		return res + s2;
	}
}
