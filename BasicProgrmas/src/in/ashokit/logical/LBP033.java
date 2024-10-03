package in.ashokit.logical;

import java.util.Scanner;

/*An e-commerce company plans to give their customers a discount for the newyears holiday. 
 * The discount will be calcualted on the basis of the bill amount of the order placed. 
 * The discount amount is the sum of all the odd digits in the customers total bill amount.
 *  if no odd digits is present in the bill amount, then discount will be zero.

input ---------> the input consists of an integer bill amount, representing the customers total bill amount.

output -------> print an integer representing the dicount for the given total bill amount.
constraint ---> n>0*/
public class LBP033 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a bill amount::");
		int amt = sc.nextInt(),remainder,sum=0;
		while (amt != 0) {
            remainder = amt%10;
            if(remainder%2 !=0)
            	sum = sum + remainder;
            amt = amt /10;
		}
		System.out.println("Discount for bill amount ::"+sum);

	}

}
