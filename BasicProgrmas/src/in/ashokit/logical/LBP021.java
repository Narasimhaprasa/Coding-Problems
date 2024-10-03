package in.ashokit.logical;

import java.util.Scanner;

/*Christmas offer

An e-commerce company plans to give their customers a special discount for the Christmas, they are planning to offer a flat discount. 
The discount value is calculated as the sum of all prime digits in the total bill amount.

Write an algorithm to find the discount value for the given total bill amount.

input ----> the input consists of an integer order value representing the total bill amount
condition-> no conditions
output ---> print an integer representing discount value for the given total bill amount.
*/
public class LBP021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a bill Amount ::");
		int amount = sc.nextInt(),remainder,sum=0;

		while (amount != 0) {
                 remainder = amount%10;
                 if(remainder==2 || remainder==3 || remainder==5 || remainder==7)
                	 sum=sum+remainder;
                 amount = amount/10;
		}
		System.out.println("The discount value is for christmas offer ::"+sum);

	}

}
