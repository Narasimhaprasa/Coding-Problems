package in.ashokit.logical;

import java.util.Scanner;

/*Say "Hello" Say "Bye"

Write a function that takes a string name and number num (either 1 or 0) and return "Hello"+name if number is 1, otherwise "Bye"+name.

input ------> a string from the user
constraint -> no
output -----> a string


Ex:
	Prakash, 1 ------> Hello Prakash
	Prakash, 0 ------> Bye Prakash
	Boss, 1----------> Hello Boss
	Boss, 0 ---------> Bye Boss*/

public class LBP072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name ::");
		String name = sc.nextLine();
		System.out.println("Enter a 0 or 1 ::");
		int num = sc.nextInt();
		String result = formatStr(name, num);
		System.out.println(result);
	}

	public static String formatStr(String str, int num) {
		String res = "";
		if (num == 1)
			res = "Hello" + " " + str;
		else if (num == 0)
			res = "Bye " + str;
		return res;
	}

}
