package in.ashokit.logical;
/*Implement a program that takes a string and returns true or false, depending on whether the characters are in order or not.

input ---------> String from the user
contraint -----> non-empty string
output --------> true or false*/

import java.util.Scanner;

public class LBP084 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ::");
		String s1 = sc.nextLine();
		boolean res = checkOrdStr(s1);
		System.out.println(res);

	}

	public static boolean checkOrdStr(String s1) {
		char[] chr = s1.toCharArray();
		int i, j, len = chr.length;
		char ch;
		for (i = 0; i < len; i++) {
			for (j = i + 1; j < len; j++) {
				if (chr[i] > chr[j]) {
					ch = chr[i];
					chr[i] = chr[j];
					chr[j] = ch;
				}
			}
		}
		String s2 = "";
		s2 = s2.valueOf(chr);
		if (s1.equals(s2))
			return true;
		else
			return false;
	}

}
