package in.ashokit.logical;

import java.util.Scanner;

/*Index of first vowel

create a function that returns the index of first vowel in a string

input ------> a string
con --------> no
output -----> an int value

Ex:
	"welcome" -----> 1
	"abc" ---------> 0
	"prakash" -----> 2*/

public class LBP075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string::");
		String word = sc.nextLine().toLowerCase();
		int result = checkFirstVowelStr(word);
		System.out.println(result);
	}

	public static int checkFirstVowelStr(String word) {
		char[] chr = word.toCharArray();
		int i, len = chr.length, index = 0;

		for (i = 0; i < len; i++) {
			if (chr[i] == 'a' || chr[i] == 'e' || chr[i] == 'i' || chr[i] == 'o' || chr[i] == 'u') {
				index = i;
				break;
			}
		}
		return index;
	}

}
