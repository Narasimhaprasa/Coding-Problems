package com.nt.programs;

import java.util.Scanner;

public class CalculatorOption {

	public static void main(String[] args) {
		// reaad input values from enduser
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first Number::");
		int num1 = sc.nextInt();
		System.out.println("Enter a Second Number::");
		int num2 = sc.nextInt();
		try {
			System.out.println("1.Add");
			System.out.println("2.Sub");
			System.out.println("3.Multiply");

			System.out.println("Enter a Obove Option::");
			int option = sc.nextInt();
			if (option == 1)
				System.out.println("Add Opertion ::" + (num1 + num2));
			else if (option == 2)
				System.out.println("Sub Opertion::" + (num1 - num2));
			else if (option == 3)
				System.out.println("Multiply Opertion::" + (num1 * num2));
			else
				System.out.println("Please Enter a value above OPtion List...............!");

		} //try
		catch (Exception e) {
			e.printStackTrace();
		} //catch
		finally {
			// close the Stream 
			if (sc != null)
				sc.close();
		}
	}//main

}//class
