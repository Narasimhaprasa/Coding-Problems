package in.ashokit.logical;
/*sentence making

The teacher in a school has started to teach the very basics rule for a sentence is that it should start with a capital letter and ends with a full stop. 
If the sentence fails any of the above mentioned criteria, it will be an incorrect sentence. Make a program to validate whether a given statement 
is a correct sentence or not. The program should return True/False based on the validity.

input -----> a string from the user
con -------> no
output ----> true or false*/

import java.util.Scanner;

public class LBP270 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence::");
		String sen = sc.nextLine();
		if ((sen.charAt(0) >= 'A' && sen.charAt(0) <= 'Z') && (sen.charAt(sen.length() - 1) == '.'))
			System.out.println("True");
		else
			System.out.println("False");
	}

}
