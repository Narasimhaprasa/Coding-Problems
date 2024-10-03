package in.ashokit.logical;

import java.util.Scanner;

/*Given String/Sentence need to be reversed and the vowels need to be replaced with numbers from 1-9 in the reversed string replaced number
should be appears in descending order from left to right. 
If there are more than 9 vowels, numbering should restart from 1.

input ---------> a string from the user
constraint-----> non-empty string
output --------> updated string*/

public class LBP301 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ::");
		String s = sc.nextLine();
		int i, c = 1, len = s.length();

		for (i = 0; i < len; i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'|| s.charAt(i) == 'u') {
				System.out.print(c++);
				if (c == 10)
					c = 1;
			} else {
				System.out.print(s.charAt(i));
			}
		}
	}

}
