package in.ashokit.logical;

import java.util.Scanner;

/*Next 5 characters

Implement a program to display next 5 characters after input character.

input -----> a character from the user
con -------> no
output ----> next 5 characters exluding input

'a' ---> b c d e f
'b' ---> c d e f g*/
public class LBP285 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character ::");
		char ch = sc.next().charAt(0);
		for (int i = 1; i <= 5; i++) {
			ch++;
			System.out.print(ch + " ");
		}
	}

}
