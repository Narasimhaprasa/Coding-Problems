package in.ashokit.logical;

import java.util.Scanner;

/*Longest Word

Write a function that finds the longest word in a sentence. 
If two or more words are found, return the last longest word. 
Characters such as apostophe, comma, period (and the like) count as part of the word 
(e.g. O'Connor is 8 characters long).

input ------> a string from the user
con --------> no
output------> longest word 

Ex:
	welcome to java programming ----> programming
	a ab abc m mn mno --------------> mno
	python is very easy ------------> python*/

public class LBP076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence on your own::");
		String sen = sc.nextLine();
		String longestWord = findLongestWord(sen);
		System.out.println(longestWord);
	}

	public static String findLongestWord(String sen) {
		String[] s = sen.split(" ");
		int m = 0;
		String res = "";
		for (String word : s) {
			if (m <= word.length()) {
				m = word.length();
				res = word;
			}
		}
		return res;
	}

}
