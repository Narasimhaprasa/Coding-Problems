package in.ashokit.logical;

import java.util.Scanner;

/*Number of consonants

Implement a program to return number of consonants present in the given string

input ---------> a string from the user
con -----------> non-empty string
output --------> return number of consonants

Ex:
	welcome -----> 4
	prakash -----> 5*/
public class LBP097 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word :::");
		String word = sc.nextLine();
		int result = findConsonantsCntInWord(word);
		System.out.println(result);
	}

	public static int findConsonantsCntInWord(String word) {
		char[] chr = word.toCharArray();
		int i, len = chr.length, consonantsCnt = 0;

		for (i = 0; i < len; i++) {

			if (chr[i] == 'a' || chr[i] == 'e' || chr[i] == 'i' || chr[i] == 'o' || chr[i] == 'u')
				continue;
			else
				consonantsCnt++;
		}
		return consonantsCnt;
	}

}
