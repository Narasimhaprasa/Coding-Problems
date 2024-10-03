package in.ashokit.logical;

import java.util.Scanner;

/*

Swap corner words and reverse middle characters

Write a Java program to take an input string and exchange the first and last word and reverse the middle word.

input -------> a string
con ---------> no
output ------> a string

Ex:
	abc def ghi mno xyz -----> xyz onm ihg fed abc*/

public class LBP079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence::");
		String sen = sc.nextLine();
		String res = exchangeString(sen);
		System.out.println(res);

	}

	public static String exchangeString(String s) {
		String[] sp = s.split(" ");
		int i, len = sp.length;
		String res = "";

		for (String word : sp) {
			if (sp[0] == word)
				res = res + " " + sp[len - 1];
			else if (sp[len - 1] == word)
				res = res + " " + sp[0];
			else {
				String s1 = "";
				for (i = word.length() - 1; i >= 0; i--) {
					s1 = s1 + word.charAt(i);
				}
				res = res + " " + s1;
			}
		}

		return res;
	}
}
