package in.ashokit.logical;

import java.util.Scanner;

/*Check only digits

Implement a program to check if a string contains only digits.

input ----> a string from the user
con ------> no
output ---> Yes or No

Ex:
	abc123	----> No
	123456  ----> Yes
	abcdef -----> No*/
public class LBP098 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  string ::");
		String word = sc.nextLine();
		String result = checkStrIsDigit(word);
		System.out.println(result);
	}

	public static String checkStrIsDigit(String word) {
		char[] chr = word.toCharArray();
		int i, len = chr.length, digitCnt = 0;
		for (i = 0; i < len; i++) {
			if (chr[i] >= '0' && chr[i] <= '9')
				digitCnt++;
		}
		return (digitCnt == len) ? "yes,It is contain only digits..!" : "No it is contain mixed characters";
	}

}
