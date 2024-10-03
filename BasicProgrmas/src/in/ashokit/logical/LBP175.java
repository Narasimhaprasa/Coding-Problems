package in.ashokit.logical;
/*Print Prime Numbers

Implement a program to read a number and print prime numbers upto n seperated by commas.

input ----> a number from the user
con ------> no
output ---> comma seperated prime numbers

Ex:
	10 ---> 2 3 5 7*/

import java.util.Scanner;

public class LBP175 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int n = sc.nextInt();
		checkNum(n);
	}

	public static void checkNum(int n) {
		int i;
		for (i = 1; i <= n; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}
	}

	public static boolean isPrime(int num) {
		int i, f = 0;
		for (i = 1; i <= num; i++) {
			if (num % i == 0)
				f++;
		}
		return f == 2;
	}
}
