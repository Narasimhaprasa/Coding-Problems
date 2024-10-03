package in.ashokit.logical;

import java.util.Scanner;

/*Implement a program that returns the number of decimal places a number (given as a string) has. 
 * Any zeros after the decimal point count towards the number of decimal places.

input ------> a string from the user
constraint--> non empty string
output -----> count of decimal places

Ex:
	12.345 -----> 3
	12.12 ------> 2
	4.1234 -----> 4*/

public class LBP077 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number :::");
		String decimalNum = sc.nextLine();
		int result = countDecimalDigits(decimalNum);
		System.out.println(result);
	}

	public static int countDecimalDigits(String num) {

		char[] chr = num.toCharArray();
		int i, len = chr.length, count = 0;
		boolean flag = false;
		for (i = len - 1; i >= 0; i--) {
			if (chr[i] == '.') {
				flag = true;
				break;
			} else {
				count++;
			}
		}
		if (flag == true)
			return count;
		else
			return 0;
	}

}
