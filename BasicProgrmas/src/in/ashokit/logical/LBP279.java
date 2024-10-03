package in.ashokit.logical;

import java.util.Scanner;

/*pronic number

A pronic number is a number which is a product of two consecutive integers, that is, 
a number of the form n(n + 1). 
Create a function that determines whether a number is pronic or not.

input------> a number from the user
con -------> no
output ----> true or false*/
public class LBP279 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a N value ::");
		int n = sc.nextInt();
		int x = (int) Math.sqrt(n);
		System.out.println(n == x * (x + 1));*/
		for (int i = 0; i < 1000; i++) {
			if (checkPronicNumber(i))
				System.out.print(i + " ");
		}
	}

	public static boolean checkPronicNumber(int n) {
		int square = (int) Math.sqrt(n);

		return n == square * (square + 1);
	}
}
