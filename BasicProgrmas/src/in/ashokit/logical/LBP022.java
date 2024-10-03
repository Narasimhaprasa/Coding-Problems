package in.ashokit.logical;

import java.util.Scanner;

/*Niven Number

Write a program to accept a number and check and display whether it is a Niven Number or not.
Niven Number is that a number which is divisible by its sum of digits.

input -----> a number
constraint-> n>01
output ----> Niven Number or Not*/
public class LBP022 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a Niven number::");
	 int num = sc.nextInt(),remainder,sum=0,temp=num;
	 while(num!=0) {
		 remainder = num%10;
		 sum= sum+remainder;
		 num=num/10;
	 }
	 if(temp%sum ==0)
		 System.out.println("It is niven number ::"+temp);
	 else
		 System.out.println("It is not a niven number::"+temp);

	}

}
