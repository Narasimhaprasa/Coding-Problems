package in.ashokit.logical;

import java.util.Scanner;

/*secret information

A spy wants to send some secret information to the government. As the data is very important, he encrypts the message by encoding by adding some extra
 characters. the original message has only upper case letters and numbers, while the extra characters are madeup of lowercase letters and special characters.
  Can you help the receiver in designing a program that accepts the message and returns the secret information.

input ------> a string from the user
con --------> no
output -----> original message

Ex:
	W^EL$COM&E to JaAvVaA18 ---> WELCOME JAVA18*/
public class LBP177 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a encryption data ::");
		String key = sc.nextLine();
		for (int i = 0; i < key.length(); i++) {
			if ((key.charAt(i) >= 'A' && key.charAt(i) <= 'Z') || (key.charAt(i) >= '0' && key.charAt(i) <= '9')|| key.charAt(i) == ' ')
				System.out.print(key.charAt(i));
		}

	}

}
