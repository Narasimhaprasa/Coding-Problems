package in.ashokit.logical;

import java.util.Scanner;

public class LBP009 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter a number ::");
		 int num = sc.nextInt(),remainder ,sum = 0;
		 
		 while(num!=0) {
			 remainder = num %10;
			 if(remainder%2 ==0)
				 sum = sum+remainder;
			 
			 num = num/10;
		 }
		 System.out.println(sum);

	}

}
