package in.ashokit.logical;

import java.util.Scanner;

/*Given two strings, a and b, return the result of putting them together in the order abba, 

e.g. "Hi" and "Bye" returns "HiByeByeHi".

input ------> two strings s1 and s2
constraint--> non-empty strings
output -----> return expected string

Ex:
    a = "wel"
    b = "come"*/
public class LBP052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first string::");
		String s1 = sc.nextLine();
		System.out.println("Enter a second String ::");
		String s2 = sc.nextLine();
		System.out.println(s1+s2+s2+s1);

	}

}
