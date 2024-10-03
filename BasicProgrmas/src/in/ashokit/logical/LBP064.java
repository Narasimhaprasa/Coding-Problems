package in.ashokit.logical;
/*X's and O's, Nobody knows

Create a function that takes a string, check if it has the same number of x's and o's and returns either true or false.

Rules:

1. return boolean value true or false.
2. returns true if the amount x's and o's are the same.
3. returns false if they are not the same amount.
4. the string can contains any character.
5. when 'x' and 'o' are not in the string, return true.

input ---------> a string
constraints----> no
output --------> true or false*/

import java.util.Scanner;

public class LBP064 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String contain o's and x's ::");
		String word = sc.nextLine();
		boolean checkStr = checkStr(word);
		System.out.println((checkStr == true) ? "true" : "false");
	}

	public static boolean checkStr(String word) {
		char[] chr = word.toCharArray();
		int i, xCnt = 0, oCnt = 0, len = chr.length;
		for (i = 0; i < len; i++) {
			if (chr[i] == 'x')
				xCnt++;
			if (chr[i] == 'o')
				oCnt++;

		}
		return oCnt == xCnt;
	}
}
