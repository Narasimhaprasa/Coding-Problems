package in.ashokit.logical;

import java.util.Scanner;

/*An e-Commerce company plans to give their customers a discount for the New Year’s holiday. 
 * The discount will be calculated on the basis of the bill amount of the order place. 
 * The discount amount is the product of the sum of all odd digits and the sum of all even digits of the customers total bill amount.

input --------> an integer representing bill amount
constraint ---> bill amount >0
output -------> return discount value*/
public class LBP043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a bill amount ::");
		int billAmt = sc.nextInt(), remainder, oddDigits = 0, evenDigits = 0;

		while (billAmt != 0) {
			remainder = billAmt % 10;
			if (remainder % 2 == 0)
				evenDigits = evenDigits + remainder;
			else
				oddDigits = oddDigits + remainder;
			billAmt = billAmt / 10;
		}

		System.out.println("The discount is calculated based on even and odd digits ::" + (evenDigits * oddDigits));

	}

}
