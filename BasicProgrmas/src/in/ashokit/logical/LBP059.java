package in.ashokit.logical;

import java.util.Scanner;

/*Anagrams

Two strings a and b are called anagrams, 
if they contain all the same characters in the same frequencies.

input --------> two strings a and b
constraint ---> no
output -------> true or false

Ex:
    'abc' and 'xyz' ---------> false
    'abc' and 'cab' ---------> true
    'abc' and 'cbaa' --------> false */

public class LBP059 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first string::");
		String s1 = sc.nextLine();
		System.out.println("Enter a second String::");
		String s2 = sc.nextLine();
		String sort1 = sort(s1);
		String sort2 = sort(s2);

		System.out.println((sort1.equals(sort2)) ? "both words same" : "Not same ");
	}

	public static String sort(String str) {

		char[] chr = str.toCharArray();
		int i, j, length = chr.length;
		char ch;
		String res = "";
		for (i = 0; i < length; i++) {
			for (j = i + 1; j < length; j++) {
				if (chr[i] > chr[j]) {
					ch = chr[i];
					chr[i] = chr[j];
					chr[j] = ch;
				}
			}
		}
		for (i = 0; i < length; i++) {
			res = res + chr[i];
		}
		return res;
	}

}
