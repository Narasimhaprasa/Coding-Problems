package in.ashokit.logical;

import java.util.Scanner;

/*A company wishes to devise an order confirmation procedure. They plan to require an extra confirmation instead of simply auto-confirming the order 
 * at the time it is placed. For this purpose, the system will generate one time password to be shared with the customer. 
 * The customer who is placing the order has to enter the OTP to confirm the order. The OTP generated for the requested order ID, as the product of the digits in orderID. 

Write an algorithm to find the OTP for the OrderID.

input -------> an integer value representing order id.
constraint --> n>0
output ------> product of the digits*/
public class LBP041 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter a order ID::");
	 int orderId = sc.nextInt(),remainder,product=1;
	 
	 while(orderId!=0) {
		 remainder = orderId%10;
		 product = product*remainder;
		 orderId = orderId/10;
	 }
	 System.out.println("Please enter OTP for confirming your order ::"+product);

	}

}
