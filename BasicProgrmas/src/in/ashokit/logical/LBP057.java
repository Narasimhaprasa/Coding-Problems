package in.ashokit.logical;

import java.util.Scanner;

/*Reverse the order of a String

create a method/function that takes a string as its argument and returns the string in reversed order.

input ---------> a string 
constraint ----> no
output --------> reversed string

Ex:

    java and python ---> nohtyp dna avaj
*/
public class LBP057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string ::");
		String word = sc.nextLine();
		String reverse = reverseString(word);
		System.out.println(reverse);
	}

	public static String reverseString(String str) {
		int i, length = str.length();
		String result = "";
		for (i = length - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}

}
