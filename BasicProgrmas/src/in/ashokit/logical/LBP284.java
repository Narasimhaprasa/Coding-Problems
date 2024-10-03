package in.ashokit.logical;

import java.util.Scanner;

/*Factorize a Number

Implement a program to that takes a number as its argument and returns an array of all its factors

input -----> a number
con -------> no
output ----> list of factors*/
public class LBP284 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int num = sc.nextInt(), i;
		for (i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.print(i + " ");
		}
	}

}
