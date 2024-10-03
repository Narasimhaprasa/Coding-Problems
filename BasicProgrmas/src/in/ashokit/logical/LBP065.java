package in.ashokit.logical;

import java.util.Scanner;

/*Stuttering Function

write a function that shutters a word as if someone is struggling to read it. The first two letters are repeated twice with an ellipsis ... , 
and then the word is pronounced with a question mark?

input ------------> a string
contraint --------> no
output -----------> xx...xx...~~~~~~~?


Ex:
	computer ----> co...co...computer?
	programming -> pr...pr...programming?*/

public class LBP065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word ::");
		String w = sc.nextLine();
		System.out.println(w.substring(0, 2) + "..." + w.substring(0, 2) + "..." + w.substring(0, w.length()) + "?");

	}

}
