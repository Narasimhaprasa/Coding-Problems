package in.ashokit.logical;

import java.util.Scanner;

/*Create a function that replaces all the vowels in a string with a specified character,

input -----------> A string from the user and a character
cons ------------> no
output ----------> A string

Ex:
	welcome, a -----> walcama
	prakash, z -----> przkzsh
	bcd, z ---------> bcd*/

public class LBP071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = sc.nextLine();
		System.out.println("Enter  a character to replace::");
		String ch = sc.next();
		String result = replaceVowelWithChar(word, ch);
		System.out.println(result);
	}

	public static String replaceVowelWithChar(String word, String ch) {
		char[] chr = word.toCharArray();
		int i, len = chr.length;
		String res = "";
		for (i = 0; i < len; i++) {
			if (chr[i] == 'a' || chr[i] == 'e' || chr[i] == 'i' || chr[i] == 'o' || chr[i] == 'u')
				res = res + ch;
			else
				res = res + chr[i];
		}
		return res;
	}
}
