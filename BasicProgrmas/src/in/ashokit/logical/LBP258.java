package in.ashokit.logical;

import java.util.Scanner;

/*The Past Book

To create a profile on a scocial media account "ThePastBook". The user needs to enter a string value in the form of user name.
 The username should consist of only characters tagged a-z. if  the user enters an incorrect string containing digits the system automcatically 
identifiers the number of digits in the string and removes them.

Write an alogorithm to help the system identify the count of digits present in the username.

input -----> A string from the user.
con -------> no
output ----> count of digits

Ex:
    admin123 ----> 3
    prakash -----> 0*/
public class LBP258 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  user name ::");
		String userName = sc.nextLine();
		int i, count = 0, len = userName.length();
		for (i = 0; i < len; i++) {
			if (userName.charAt(i) >= '0' && userName.charAt(i) <= '9')
				count++;
		}
		System.out.println("Number of digits present in the account::" + count);
	}

}
