package in.ashokit.logical;

import java.util.Scanner;

/*Sum of even numbers

Implement a program to find sum of even number between x and y both are inclusive.

input -----> two int values
constraint-> no
output ----> sum of even numbers between x and y*/
public class LBP024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a x value::");
		int x = sc.nextInt();
		System.out.println("Enter a y value ::");
		int y = sc.nextInt();
		int sum = 0, i;
		for (i = x; i <= y; i++) {
             if(i%2==0)
            	 sum=sum+i;
		}
		System.out.println("sum of even numbers between x and y::"+sum);

	}

}
