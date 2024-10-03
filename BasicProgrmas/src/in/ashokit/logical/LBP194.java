package in.ashokit.logical;

import java.util.Scanner;

/*Password change

Prakash a technical person wants to update his password for every 15 days, to create a new password, he is converting all lower case letters to 
upper case and upper case letters to lower case, help prakash to update password. 

input ------> a string from the user old password
con --------> no
output -----> updated password

Ex:
	prakash ----> PRAKASH
	abCD	 ---> ABcd*/
public class LBP194 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ::");
		String word = sc.nextLine();
		String updatePassword = updateString(word);
		System.out.println(updatePassword);
	}

	public static String updateString(String word) {
		int i, len = word.length();
		String res = "";
		for (i = 0; i < len; i++) {
			if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
				res = res + (char) (word.charAt(i) + 32);
			if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
				res = res + (char) (word.charAt(i) - 32);

		}
		return res;
	}

}
