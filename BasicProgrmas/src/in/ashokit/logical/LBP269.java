package in.ashokit.logical;

import java.util.Scanner;

/*Prime Number Busses

James wants to travel by bus to reach his friend John's home. John gave a hint that all busses from Jame's location will reach his home
 if the bus number is prime number.
Write a programto help James find the bus that reaches John's home.

input -----> a number from the user
con -------> no
output ----> yes or no*/

public class LBP269 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a bus number ::");
		int busNum = sc.nextInt();
		boolean res = isPrime(busNum);
		System.out.println(res);
	}

	public static boolean isPrime(int busNum) {
		int i, f = 0;
		for (i = 1; i <= busNum; i++) {
			if (busNum % i == 0)
				f++;
		}
		return f == 2;
	}
}
