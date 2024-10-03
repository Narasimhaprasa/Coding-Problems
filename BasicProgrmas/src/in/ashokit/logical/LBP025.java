package in.ashokit.logical;

import java.util.Scanner;

/*Celsius to Fahrenheit

Create a function/method to convert celsius to fahrenheit.*/
public class LBP025 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a celsius ::");
	 int c = sc.nextInt(),f;
	 f=(c*9/5)+32;
	 
	 System.out.println(f);

	}

}
