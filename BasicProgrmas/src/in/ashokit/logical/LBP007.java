package in.ashokit.logical;

import java.util.Scanner;

public class LBP007 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter a number :: ");
		 int num = sc.nextInt(),remainder;
		 
		 while (num!=0) {
			 remainder = num%10;
			 System.out.print(remainder+" ");
			num = num/10;
		 }
	}

}
