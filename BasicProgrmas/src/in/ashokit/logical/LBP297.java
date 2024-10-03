package in.ashokit.logical;

import java.util.Scanner;

/*ending 3

Implement a program to print the list of integers which are ending with 3 in the given range.

input -----> n1 and n2 values
con -------> no
output ----> list of int values
*/
public class LBP297 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a n1 value ::");
		int n1 = sc.nextInt();
		System.out.println("Enter a n2 value ::");
		int n2 = sc.nextInt();

		int i;
		for (i = n1; i <= n2; i++) {
			if (i % 10 == 3)
				System.out.print(i + "");
		}
	}

}
