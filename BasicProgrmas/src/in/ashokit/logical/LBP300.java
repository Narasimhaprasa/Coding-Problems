package in.ashokit.logical;

import java.util.Scanner;

/*Implement a program to find sum of last three digits in the given number.

input ------> an int value
con --------> must be three digit number
output -----> int value

logic:
        n%10 + (n/10)%10 + (n/100)%10*/
public class LBP300 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number must be three digit number::");
		int num = sc.nextInt();
		sum(num);
		//  System.out.println(n%10+(n/10)%10+(n/100)%10);
	}

	public static void sum(int n) {
		int remainder, sum = 0, count = 0;
		while (n != 0) {
			remainder = n % 10;
			if (count < 3) {
				count++;
				sum = sum + remainder;
			}
			n = n / 10;
		}
		System.out.println(sum);
	}
}
