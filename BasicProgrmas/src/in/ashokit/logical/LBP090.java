package in.ashokit.logical;

import java.util.Scanner;

/*Given a string containing unique letters, return a sorted string with the letters that don't appear in the string.

input -------> A string from the user
constraint --> non empty string
output ------> return missing characters in the given string


Ex:
	abghijklmnopqrstuvwxyz ------> cdef
	abcdefghijklmnopqrstuv ------> wxyz*/

public class LBP090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a alpabers :");
		String alpha = sc.nextLine();
		String result = findMissingLetters(alpha);
		System.out.println(result);
	}

	public static String findMissingLetters(String str) {
		char[] chr = str.toCharArray();
		int i, len = chr.length;
		int a[] = new int[26];
		String res = "";
		for (i = 0; i < len; i++) {
			a[chr[i] - 97]++;
		}
		for (i = 0; i < a.length; i++) {
			if (a[i] == 0)
				res = res + (char) (i + 97);
		}
		return res;
	}

}
