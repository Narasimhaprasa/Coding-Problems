package in.ashokit.logical;

import java.util.Scanner;

public class LBP008 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number ::");
		 
		 int num = sc.nextInt(),remainder , sum = 0;
		 
		 while(num !=0) {
			 remainder = num%10;
			 sum =sum+remainder;
			 num = num/10;
		 }
		 
		 System.out.println("Sum of digits :: "+sum);

	}

}
