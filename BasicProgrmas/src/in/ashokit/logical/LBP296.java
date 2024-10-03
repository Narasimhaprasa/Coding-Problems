package in.ashokit.logical;

import java.util.Scanner;

/*Divisible by 5 or 7

Implement a program to print the list of integers which are divisible by 5 or 7.

input ----> a number from the user
con ------> no
output ---> seq of int values which are divisible by 5 or 7*/

public class LBP296 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 5 == 0 || i % 7 == 0)
				System.out.print(i + " ");
		}
	}

}
