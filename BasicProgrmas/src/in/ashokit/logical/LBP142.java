package in.ashokit.logical;

import java.util.Scanner;

/*Array of multiples

Implement a program to create an array with n elements by taking multiples of m.

input -----> m and n 
con--------> size of the array must be n
output ----> return an array with n elements which contains multiples of m.

Ex:
    n = 4
    m = 5

    output: 5 10 15 20
*/
public class LBP142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a n value ::");
		int n = sc.nextInt();
		System.out.println("Enter a m value ::");
		int m = sc.nextInt();
		printMultiplynum(m, n);
	}

	public static void printMultiplynum(int m, int n) {
		int i;
		for (i = 1; i <= n; i++) {
			int prod = m * i;
			System.out.print(prod + " ");
		}
	}
}
