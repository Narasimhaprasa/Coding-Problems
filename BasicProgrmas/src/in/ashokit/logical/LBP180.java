package in.ashokit.logical;

import java.util.Scanner;

/*parity bits

Michael wants to check the parity of the given number. To find tha parity, follow below steps.

1. convert decimal number into binary number.
2. count the number of 1's and 0's in the binary representation.

if it contains odd number of 1-bits, then it is "odd parity" and if contains even number of 1-bits then "even parity" 
Write a program to validate the given number belongs to odd parity or even parity.

input -------> a number from the user.
con ---------> no
output ------> odd parity or even parity.*/

public class LBP180 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a num::");
       int n = sc.nextInt(),d,c=0;
       while(n!=0) {
    	   d = n%2;
    	   if(d==1)
    		   c++;
    	   n=n/2;
       }
       System.out.println((c%2==0)?"even":"odd");
	}

}
