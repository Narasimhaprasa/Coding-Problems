package in.ashokit.logical;
/*Defanging an IP address

Given a valid IP address, return a defanged version of that IP address. A defanged IP address replaces every period '.' with "[.]".

input ----------> A string
constraint -----> non-empty String
output ---------> replacement String

. ---> [.]

Ex:
    120.23.1.45 ----> 120[.]23[.]1[.]45*/

import java.util.Scanner;

public class LBP051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid IP address::");
		String ipAddress = sc.nextLine();

		char[] chr = ipAddress.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			if (chr[i] == '.')
				System.out.print("[.]");
			else
				System.out.print(chr[i]);
		}

	}

}
