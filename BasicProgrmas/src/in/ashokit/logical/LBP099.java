package in.ashokit.logical;

import java.util.Scanner;

/*Capitalize Every word first character

Implement a program to capitalize first letter of each word in a string.

input ----> a string from the user
con ------> non-empty string
output ---> a string with capitalization

Ex:
	welcome to python ----> Welcome To Python
	java is very diff ----> Java Is Very Diff
	python is very ver easy --> Python Is Very Very Easy*/

public class LBP099 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  sentence your own ::");
		String sen = sc.nextLine();
		String result = printFirstCharAsUppercase(sen);
		System.out.println(result);
	}

	public static String printFirstCharAsUppercase(String word) {

		String[] split = word.split(" ");
		String res = " ";
		int i = 1;
		for (String s : split) {
			res = res + s.substring(0, 1).toUpperCase() + s.substring(1) + " ";
		}
		return res;
	}

}
