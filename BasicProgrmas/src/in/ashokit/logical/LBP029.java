package in.ashokit.logical;

import java.util.Scanner;

/*Prime Number or Not

Write a program to check whether the given number is prime number or not. 
A number is said to prime if it is having only two factors. i.e. 1 and number itself.

input ------> a number from the use
constraint--> n>1
output -----> true or false
*/
public class LBP029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a prime number ::");
		int num = sc.nextInt(), i, f = 0;

		for (i = 1; i <= num; i++) {
			if (num% i == 0)
				f++;

		}
		if (f == 2)
			System.out.println("It is only two factor or prime number");
		else
			System.out.println("It is not a prime number ");
	}

}
