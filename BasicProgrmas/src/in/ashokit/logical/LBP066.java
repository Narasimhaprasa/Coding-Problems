package in.ashokit.logical;

import java.util.Scanner;

/*Repeating Letters

Create a method that takes a string and returns a string in which each character is repeated once.

input ---------------> String from the user
constraint ----------> No
output --------------> String

Ex:
	welcome ---> wweellccoommee
	python ----> ppyytthhoonn*/
public class LBP066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word ::");
		String word = sc.nextLine();
		String res = repeatChar(word);
		System.out.println(res);
	}

	public static String repeatChar(String word) {
		int i, len = word.length();
		String result = "";
		for (i = 0; i < len; i++) {
			result = result + word.charAt(i) + "" + word.charAt(i);
		}
		return result;
	}

}
