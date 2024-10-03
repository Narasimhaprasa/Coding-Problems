package in.ashokit.logical;

import java.util.Scanner;

/*Remove Every vowel from a String

Create a function that takes a string and returns a new string with all vowels removed. 

input -------------> a string 
constraints -------> No
output ------------> a string

Ex:
	welcome ----> wlcm
	python -----> pythn*/

public class LBP069 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word ::");
		String word = sc.nextLine();
		String result = removeVowles(word);
		System.out.println(result);
		System.out.println(word.replaceAll("[aeiou]", ""));
	}

	public static String removeVowles(String word) {
		char[] chr = word.toCharArray();
		int i, len = chr.length;
		String res = "";
		for (i = 0; i < len; i++) {
			if (chr[i] == 'a' || chr[i] == 'e' || chr[i] == 'i' || chr[i] == 'o' || chr[i] == 'u')
				continue;
			else
				res = res + chr[i];

		}
		return res;
	}

}
