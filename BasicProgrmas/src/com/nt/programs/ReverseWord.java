package com.nt.programs;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		
		 // to read the values from user (dynamically)
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		if (word.equals("prasad"))
			System.out.println("Welcome to new life");
		else
			System.out.println("Your wrong person");

	}

}
