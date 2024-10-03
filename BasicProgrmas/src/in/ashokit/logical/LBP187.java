package in.ashokit.logical;

import java.util.Scanner;

/*last and second-last

Given a string, 
create a new string made up of its last two letters, reversed and seperated by comma.

input ------> a string from the user
con --------> no
output -----> comma seperated last and second-last character

Ex:
	welcome ---> e,m*/
public class LBP187 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ::");
		String word = sc.nextLine();
		int len = word.length();
		System.out.println(word.charAt(len - 1) + "," + word.charAt(len - 2));

	}

}
