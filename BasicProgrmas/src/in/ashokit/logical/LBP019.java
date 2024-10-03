package in.ashokit.logical;

import java.util.Scanner;

/*Decimal to Binary

A network protocol specifies how data is exchanged via transmission media. 
The protocol converts each message into a stream of 1's and 0's. 
Given a decimal number, write an algorithm to convert the number into a binary form.

input ---------> a number
constraint ----> n>=0
output --------> binary number
*/
public class LBP019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int num = sc.nextInt();

		int[] a = new int[20];
		int i = 0,d;

		while (num != 0) {
			d = num % 2;
			a[i++] = d;
			num = num / 2;
		}
		
		 for(i=i-1;i>=0;i--)
		      System.out.print(a[i]+" ");
	}

}
