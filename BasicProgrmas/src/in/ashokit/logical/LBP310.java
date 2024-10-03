package in.ashokit.logical;

import java.util.Scanner;

/*Given a number n, for each integer i in the range from 1 to n inclusive, print one value per line as follows.

=> if n is a multiple of both 3 and 5 print FizzBuzz
=> if n is a multiple of 3 (but not 5), print Fizz
=> if n is a multiple of 5 (but not 3), print Buzz
=> if n is not a multiple of 3 or 5 print the value of n.

implement a program to read number n print the output as described above.

input ------> a number n
con --------> no
output -----> print n string as per the above rules.
*/
public class LBP310 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int n = sc.nextInt();
		check(n);
	}

	public static void check(int n) {
		if (n % 3 == 0 && n % 5 == 0)
			System.out.println("FizzBuzz");
		else if (n % 3 == 0 && n % 5 != 0)
			System.out.println("Fizz");
		else if (n % 5 == 0 && n % 3 != 0)
			System.out.println("Buzz");
		else
			System.out.println(n);
	}
}
