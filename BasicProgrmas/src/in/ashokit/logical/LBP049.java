package in.ashokit.logical;

import java.util.Scanner;

/*Next Prime

Given an integer, create a function that returns the next prime. If the number is prime, return the number itself.

input ----------> a number
constraint -----> prime number
output ---------> prime number*/
public class LBP049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int num = sc.nextInt();
		while (true) {
			if (isPrime(num)) {
				System.out.println("It is a prime number ::" + num);
				break;
			} else {
				System.out.println(++num);
			}

		}
	}

	public static boolean isPrime(int n) {

		int i, f = 0;
		for (i = 1; i <= n; i++) {
			if (n % i == 0)
				f++;
		}
		return f == 2;
	}
}
