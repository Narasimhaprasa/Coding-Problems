package in.ashokit.logical;
/*first non-repeated character

Program to find first non-repeated character

input----> a non-empty string from the user
con -----> no
output --> non-repeated character

Ex:
	welcome -----> w
	indian ------> d
	india -------> n*/

import java.util.Scanner;

public class LBP093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ::");
		String word = sc.nextLine();
		char result = findUniqueCharacter(word);
		System.out.println(result);
	}

	public static char findUniqueCharacter(String word) {
		char[] chr = word.toCharArray();
		int i, j, len = chr.length;
		char c = 0;
		for (i = 0; i < len; i++) {
			boolean flag = true;
			for (j = 0; j < len; j++) {
				if (i != j && chr[i] == chr[j]) {
					flag = false;
				}
			}
			if (flag) {
				c = chr[i];
				break;
			}
		}
		return c;
	}

}
