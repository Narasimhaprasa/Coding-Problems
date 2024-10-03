package in.ashokit.logical;

import java.util.Scanner;

public class LBP014 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number::");
		 int num = sc.nextInt(),remainder,reverse = 0;
		 
		 while(num!=0) {
			 remainder = num%10;
			 reverse = reverse*10+ remainder;
			 num = num/10;
		 }
		 System.out.println(reverse);
	}

}
