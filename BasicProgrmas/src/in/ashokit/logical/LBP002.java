package in.ashokit.logical;

import java.util.Scanner;

public class LBP002 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a given Number ::");
	 int num = sc.nextInt();
	 
	 if(num%2 !=0) {
		 System.out.println("weird");
	 }else {
		 if(num>=2 && num<=5)
			 System.out.println("not weird");
		 else if(num>=6 && num<=20)
			 System.out.println("weird");
		 else
			 System.out.println("not weird");
	 }
	}

}
