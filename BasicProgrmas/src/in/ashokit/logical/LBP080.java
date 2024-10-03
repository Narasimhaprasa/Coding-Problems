package in.ashokit.logical;

import java.util.Scanner;

/*Valid Hex Code

Create a function that determines whether a string is a valid hex code.
A hex code must begin with a pound key # and is exactly 6 characters in length. Each character must be a digit from 0-9 or an alphabetic character 
from A-F. All alphabetic characters may be uppercase or lowercase.

input -----> a string from the user
con -------> no
output ----> true or false

format ---> #xxxxx
	    x ---> 0-9,A-F,a-f

Ex:
	#abc21		true
	#12345		true
	#123t5		false
	123456		false
	123 45		false*/

public class LBP080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a hexa Decimal code ");
		String hexaCode = sc.nextLine();
		boolean res = checkHexaDecimal(hexaCode);
		System.out.println(res);
	}

	public static boolean checkHexaDecimal(String hex) {
		char[] chr = hex.toCharArray();
		int i, len = chr.length, count = 1;
		boolean flag = false;
		if (chr[0] == '#')
			flag = true;
		for (i = 1; i < len; i++) {
			if ((chr[i] >= 'a' && chr[i] <= 'z') || (chr[i] >= 'A' && chr[i] <= 'Z')
					|| (chr[i] >= '0' && chr[i] <= '9'))
				count++;
		}
		if (flag == true && count == 6)
			return true;
		else
			return false;
	}

}
