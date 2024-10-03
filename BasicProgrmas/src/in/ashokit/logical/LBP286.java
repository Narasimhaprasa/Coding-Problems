package in.ashokit.logical;

import java.util.Scanner;

/*Composite Number

Implement a program to check whether the given number is composite number or not.

input ----> a number from the user
con ------> no
output ---> true or false*/

public class LBP286 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number ::");
		int num = sc.nextInt();
		int f = factors(num);
		System.out.println((f > 2) ? "true" : "false");
	}

	public static int factors(int num) {
		int i, f = 0;
		for (i = 1; i <= num; i++) {
			if (num % i == 0)
				f++;
		}
		return f;
	}
}
