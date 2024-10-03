package in.ashokit.logical;

import java.util.Scanner;

/*GCD of two numbers

Implement a program to read two integers values and return GCD of two numbers.

input -----> two space seperated integers.
con -------> no
output ----> GCD of two numbers.*/

public class LBP176 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a n1 value ::");
		int n1 = sc.nextInt();
		System.out.println("Enter a n2 value ::");
		int n2 = sc.nextInt(), n3 = 0, i;

		for (i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0)
				n3 = i;
		}
		System.out.println(n3);

	}

}
