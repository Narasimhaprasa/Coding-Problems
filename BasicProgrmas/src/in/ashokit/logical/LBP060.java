package in.ashokit.logical;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*Max Occurring Character

Given a string, implement a program to find max occurring character in the given string

input -------> A string from the user.
constraints--> No

output ------> max occurring character

Ex:
	welcome -----> e
	abababbc ----> b*/

public class LBP060 {
	static final int ASCII_SIZE = 256;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word::");
		String word = sc.nextLine();
		char res = getMaxOccouringChar(word);
		System.out.println(res);

	}

	public static char getMaxOccouringChar(String str) {
		int count[] = new int[ASCII_SIZE];
		int i, len = str.length(), max = -1;
		char result = ' ';

		for (i = 0; i < len; i++) {
			count[str.charAt(i)]++;
		}

		for (i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		return result;
	}

	/*public static char maxOccuranceChar(String str) {
	char[] chr = str.toCharArray();
	
	Arrays.sort(chr);
	int i, j, length = chr.length;
	char ch = 0;
	for (i = 0; i < length; i++) {
		int count = 1;
	
		for (j = i + 1; j < length; j++) {
			if (chr[i] == chr[j]) {
				count++;
				ch = chr[i];
			}
		}
	}
	
	return ch;
	}*/

}
