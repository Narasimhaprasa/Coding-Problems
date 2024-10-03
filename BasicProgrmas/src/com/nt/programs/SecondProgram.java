package com.nt.programs;

import java.util.Scanner;

public class SecondProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a UserName:::");
		String name = sc.next();
		System.out.println("Enter a password");
		String password = sc.next();
		
		/*// bussiness logic
		if (name.equalsIgnoreCase("prasad") && password.equalsIgnoreCase("1234"))
			System.out.println("login successfully");
		else
			System.out.println("Wrong username or password");*/
		
		// bussiness logic
		if(name.equals("prasad") && password.equals("1234"))
			System.out.println("Login Succesfully");
		else
			System.out.println("Wrong username or password");
	}

}
