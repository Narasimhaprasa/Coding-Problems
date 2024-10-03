package in.ashokit.logical;

import java.util.Scanner;

/*How many vowels

Create a function that takes a string and returns the number of vowels contained within it.

input -----------> a string
constraint ------> no
output ----------> number of vowels*/
public class LBP063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ::");
		String word = sc.nextLine();
		int result = checkVowelsCount(word);
		System.out.println("vowels count in the given word " + word + " ::" + result);
	}

	public static int checkVowelsCount(String word) {
		int i, count = 0;
		for (i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u')
				count++;
		}
		return count;
	}

}
