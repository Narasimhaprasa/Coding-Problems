package in.ashokit.logical;

import java.util.Scanner;

/*Duck Number

Program to read a number and check whether it is duck number or not.
Hint: A duck number is a number which has zeros present in it, but no zero present in the begining of the number.

input-------> a number from the user
contraint --> n>=0
output------> Yes or No*/
public class LBP015 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number::");
		int num = sc.nextInt(), remainder, flag = 0;
		while (num != 0) {
			remainder = num % 10;
			if (remainder == 0) {
				flag = 1;
				break;
			}
			num = num/10;
		}
		if (flag == 1)
			System.out.println("Yes it is duck Number");
		else
			System.out.println("No it is not duck Number");
	}

}
