package in.ashokit.logical;

import java.util.Scanner;

/*Implement a program to return first capital letter in the given string.

input --------> a string from the user
constraint ---> non-empty string
output -------> first capital letter
*/
public class LBP036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String from endUser::");
		String word = sc.nextLine();

		/*for (int i = 0; i < word.length(); i++) {
		
			if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
				System.out.println(word.charAt(i));
				break;
			}
		
		}*/
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				System.out.println(word.charAt(i));
				break;
			}
		}

	}

}
