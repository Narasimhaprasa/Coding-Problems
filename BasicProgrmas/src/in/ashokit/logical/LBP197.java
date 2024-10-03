package in.ashokit.logical;

import java.util.Scanner;

/*Backspace String Compare

Two strings are said to the same if they are of the same length and have the same character at each index. 
Backspacing in a string removes the previous character in the string.

Given two strings containing lowercase english letters and the character '#' which represents a backspace key. 
determine if the two final strings are equal or not. Return 1 if they are equal else 0.

input -----> two strings s1 and s2
con -------> no
output ----> 1 or 0

Ex:
	# symbol indicates 'back space'

	s1 = "a#bc#aa" --> "baa"
	s2 = "ba#aaa#" --> "baa"

	output: 1*/
public class LBP197 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a s1 string :");
		String s1 = sc.nextLine();
		System.out.println("Enter a s2 String ::");
		String s2 = sc.nextLine();
		int res = checkBothStringsEqual(s1, s2);
		System.out.println(res);
	}

	public static int checkBothStringsEqual(String s1, String s2) {
		int i, len1 = s1.length() - 1, len2 = s2.length() - 1;
		StringBuffer sb1 = new StringBuffer();
		for (i = 0; i <= len1; i++) {
			if (len1 == i && s1.charAt(i) != '#') {
				sb1.append(s1.charAt(i));
				break;
			}
			if (s1.charAt(i) != '#' && s1.charAt(i + 1) != '#')
				sb1.append(s1.charAt(i));

		}

		StringBuffer sb2 = new StringBuffer();
		for (i = 0; i <= len2; i++) {
			if (len2 == i && s2.charAt(i) != '#') {
				sb2.append(s2.charAt(i));
				break;
			}
			if (s2.charAt(i) != '#' && s2.charAt(i + 1) != '#')
				sb2.append(s2.charAt(i));
		}

		return sb1.toString().equals(sb2.toString()) ? 1 : 0;
	}
}
