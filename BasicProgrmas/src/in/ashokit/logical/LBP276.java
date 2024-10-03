package in.ashokit.logical;

import java.util.Scanner;

/*Neon Number

Rahul's teacher gave an assignment to all the student that when they show up tomorrow they should find a special type of number and
 report her. He thought very carefully and came up with an idea to have neon numbers. A neon number is a number where the square of the sum 
of each digit of the number results in the given number.Given an integer  N, Write a programto find whether the number N is a Neon number. 
If it's not a Neon number, print the sqaure of the sum of digits of the number.

input -------> a number
con ---------> no
output ------> true or false*/
public class LBP276 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a neon number ::");
		int n = sc.nextInt(), a, b;
		a = (n / 10) % 10;
		b = n % 10;
		System.out.println((a + b) * (a + b) == n);
		
		/*for (int i = 0; i < 1000; i++) {
			if (findNeonNumber(i))
				System.out.print(i + " ");
		}*/
	}

	/*public static boolean findNeonNumber(int x) {
		int square = x * x;
		int sum = 0;
		while (square != 0) {
			sum = sum + square % 10;
			square = square / 10;
		}
		return (sum == x);
	}*/
}
