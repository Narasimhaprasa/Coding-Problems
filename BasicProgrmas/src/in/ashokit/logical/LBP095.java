package in.ashokit.logical;

import java.util.Scanner;

/*Print First Letter of each Word

Implement a function/Method to return first character in each word from the given input string.

input-----> a string
con-------> no
output ---> first character in each string

Ex:
	Hello Prakash How Are you ---> HPHAy
	java is very easy -----------> jive
*/
public class LBP095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a sentence on your own ::");
		String sen = sc.nextLine();
		String result = findFirstLetterOfEachWord(sen);
		System.out.println(result);
	}

	public static String findFirstLetterOfEachWord(String s) {
		String[] split = s.split(" ");
		String res = "";
		for (String ss : split) {
			res = res + ss.charAt(0);
		}
		return res;
	}

}
