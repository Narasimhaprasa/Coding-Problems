package in.ashokit.logical;

import java.util.Scanner;

/*coding standards

Tom has joined a new company and he is assigned a program to code. But before starting to code, he needs to know the coding standards. 
He need to make sure that the variable name should meet the below standards, 
=> contains only english letter
=> and/or digits
=> and/or underscore (_)
=> should not start with digits

The program should return True/False based on the above conditions

input ----> a string from the user
con ------> no
output ---> true or false*/

public class LBP266 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a variable ::");
		String var = sc.nextLine();
		boolean res = checkCodingStandards(var);
		System.out.println(res);
	}

	public static boolean checkCodingStandards(String var) {
		int i, len = var.length();
		boolean flag = true;
		for (i = 0; i < len; i++) {
			if ((var.charAt(i) >= 'a' && var.charAt(i) <= 'z') || (var.charAt(i) >= 'A' && var.charAt(i) <= 'Z')
					|| (var.charAt(i) >= '0' && var.charAt(i) <= '9') || (var.charAt(i) == '_')) {
				if (var.charAt(0) >= '0' && var.charAt(0) <= '9') {
					flag = false;
					break;
				}
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
