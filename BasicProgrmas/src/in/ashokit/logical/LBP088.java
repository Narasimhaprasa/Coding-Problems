package in.ashokit.logical;

import java.util.Scanner;

/*Given a string, return the true if that can be typed using letters of alphabet on only one row's of American keyboard like the image below.

In the American keyboard:
=> the first row consists of the characters "qwertyuiop",
=> the second row consists of the characters "asdfghjkl", and
=> the third row consists of the characters "zxcvbnm".

Note: 
1. You may use one character in the keyboard more than once. 
2. You may assume the input string will only contain letters of alphabet.

input --------> A string from the user
constraint ---> length of string >1
output -------> true or false

Ex:
	abcde ------> false
	dad --------> true
	mom --------> false
	false ------> false
	true -------> true*/
public class LBP088 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String as per american keyboard::");
		String s = sc.nextLine();
		String row1 = "qwertyuiop";
		String row2 = "asdfghjkl";
		String row3 = "zxcvbnm";

		boolean isTrue = checkAmericanKeyBoard(s, row1, row2, row3);
		System.out.println(isTrue);
	}

	public static boolean checkAmericanKeyBoard(String s, String row1, String row2, String row3) {
		char[] chr1 = s.toCharArray();
		char[] chr2 = row1.toCharArray();
		char[] chr3 = row2.toCharArray();
		char[] chr4 = row3.toCharArray();
		int i, firstRowCnt = 0, secondRowCnt = 0, thirdRowCnt = 0;

		for (i = 0; i < chr1.length; i++) {
			for (int j = 0; j < chr2.length; j++) {
				if (chr1[i] == chr2[j]) {
					firstRowCnt++;
					break;
				}
			}

			for (int j = 0; j < chr3.length; j++) {
				if (chr1[i] == chr3[j]) {
					secondRowCnt++;
					break;
				}
			}

			for (int j = 0; j < chr4.length; j++) {
				if (chr1[i] == chr4[j]) {
					thirdRowCnt++;
					break;
				}
			}
		}
		if (firstRowCnt == chr1.length || secondRowCnt == chr1.length || thirdRowCnt == chr1.length)
			return true;
		else
			return false;

	}

}
