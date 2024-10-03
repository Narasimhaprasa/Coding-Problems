package in.ashokit.logical;

import java.util.Scanner;

/*Number of vowels

Implement a program to return number of vowels present in the given string

input ---------> a string from the user
con -----------> non-empty string
output --------> return number of vowels

Ex:
	welcome -----> 3
	prakash -----> 2*/
public class LBP096 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word::");
		String word = sc.nextLine();
		int res = countVowelsInStr(word);
		System.out.println(res);
	}

	public static int countVowelsInStr(String word) {
		char[] chr = word.toCharArray();
		int i, len = chr.length, vowelCnt = 0;
		for (i = 0; i < len; i++) {
			if (chr[i] == 'a' || chr[i] == 'e' || chr[i] == 'i' || chr[i] == 'o' || chr[i] == 'u')
				vowelCnt++;
		}
		return vowelCnt;
	}

}
