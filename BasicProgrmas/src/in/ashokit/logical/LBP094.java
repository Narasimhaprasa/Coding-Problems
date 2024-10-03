package in.ashokit.logical;

import java.util.Scanner;

/*Implement a program to check whether the given string pangram or not. 

A pangram is a string that contains all the letters of the English alphabet. 
An example of a pangram is "The quick brown fox jumps over the lazy dog"

input ----> a string from the user
con ------> non-empty string
output ---> Yes or No

Ex:
	The quick brown fox jumps over the lazy dog ---> a to z are there*/

public class LBP094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a alpabets :");
		String alpha = sc.nextLine().toLowerCase();

		boolean flag = true;
		for (char i = 'a'; i <= 'z'; i++) {
			if (alpha.indexOf(i) == -1) {
				flag = false;
				break;
			}
		}
		System.out.println((flag) ? "Yes" : "No");
	}

	/*	public static String findMissingLetters(String str) {
			char[] chr = str.toCharArray();
			int i, len = chr.length;
			int a[] = new int[26];
			String res = "";
			boolean flag = false;
			for (i = 0; i < len; i++) {
				a[chr[i] - 97]++;
			}
			for (i = 0; i < a.length; i++) {
				if (a[i] == 0) {
					flag = true;
					break;
				}
	
				//res = res + (char) (i + 97);
			}
			return (flag == true) ? "no" : "yes";
		}*/
}
