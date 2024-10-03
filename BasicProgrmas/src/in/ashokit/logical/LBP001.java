package in.ashokit.logical;

import java.util.Scanner;

public class LBP001 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number::");
		int num = sc.nextInt();
		
		if(num>=0) {
			if(num%2 ==0) {
				System.out.println("Even Number is"+num);
			}else {
				System.out.println("Odd Number is : "+num);
			}
		}else {
			System.out.println("Donot pass negative values ");
		}

	}
}
