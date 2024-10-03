package in.ashokit.logical;

import java.util.Scanner;

/*
Shuffle the Name

Problem Statement: Create a function/method that accepts a string (of person’s first and last name) and returns a string with in first and last name swapped).

Input:  two space separated strings
Constraints: No 
Output: return last name followed by first name

Ex:
    "Prakash" and "Babu" ---> "Babu" and "Prakash"*/

public class LBP056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first name ::");
		String fname = sc.nextLine();
		System.out.println("Enter a last name ::");
		String lname = sc.nextLine();
		String swap = swapNames(fname, lname);
		System.out.println(swap);
	}

	public static String swapNames(String fname, String lname) {
		String res = "";
		res = lname + " " + fname;
		return res;
	}

}
