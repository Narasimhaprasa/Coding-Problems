package in.ashokit.logical;

import java.util.Scanner;

/*VALID ZIP CODE

zipcodes consists of 5 consecutive digits. Given a string, write a function to determine whether the input is a valid zip code. a valid zipcode is as follows

1. must contain only numbers.
2. it should not contain any spaces.
3. length should be only 5.

input ------> A string
constraint -> no
output -----> true or false

Ex:
	517517 ------> false
	51001 -------> true
	123 4 -------> false
	abc12 -------> false
	99999 -------> true*/

public class LBP073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid Zip code::");
		String zipCode = sc.nextLine();
		boolean result = checkValidZipCode(zipCode);
		System.out.println(result);
	}

	public static boolean checkValidZipCode(String code) {
		char[] chr = code.toCharArray();
		int i, len = chr.length, count = 0;
		boolean flag = false;

		for (i = 0; i < len; i++) {
			if (chr[i] >= '0' && chr[i] <= '9')
				count++;
		}
		if (count == 5)
			flag = true;

		return flag;
	}

}
