package in.ashokit.logical;
/*Even Length Words

Write a program to print even length words in a string?

input -----> a string from the user
con -------> no
output ----> list of strings with even length

Ex:
	a ab abc abcd abcde abcdef ---> ab abcd abcdef*/

import java.util.Scanner;

public class LBP081 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence :::");
		String str = sc.nextLine();
		String result = printEvenLenWords(str);
		System.out.println(result);
	}

	public static String printEvenLenWords(String s) {
		String[] sp = s.split(" ");
		String res = "";
		for (String word : sp) {
			if (word.length() % 2 == 0)
				res = res + word + " ";
		}
		return res;
	}

}
