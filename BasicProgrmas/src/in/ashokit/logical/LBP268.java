package in.ashokit.logical;

import java.util.Scanner;

/*Be Positive 

Write a program to get two inputs from the user and find the absolute difference between the sum of two numbers and the product of two
 numbers.

input ------> two numbers from the user
con --------> no
output -----> absolute difference 

Logic:
        abs((a+b)-(a*b))*/
public class LBP268 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		int x = sc.nextInt();
		System.out.println("Enter b value:");
		int y = sc.nextInt();
		System.out.println(Math.abs((x + y) - (x * y)));

	}

}
