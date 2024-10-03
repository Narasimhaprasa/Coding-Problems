package in.ashokit.logical;

import java.util.Scanner;

/*Paliandrome Number

Program to check whether the given number is paliandrome or not

input -----> a number from the user
constraint-> n>0
output ----> Yes or No

Ex:
	121, 1331, 1221, 777, 898, etc*/
public class LBP017 {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number::");
		int num = sc.nextInt(), remainder, reverse = 0,temp = num;
		while(num!=0) {
			remainder = num%10;
			reverse = reverse*10 + remainder;
			num=num/10;
		}
		if(temp == reverse)
			System.out.println("It is palindrome Number "+reverse);
		else
			System.out.println("It is not a palindrome Number ::"+reverse);
	}

}
