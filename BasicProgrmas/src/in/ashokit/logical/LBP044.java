package in.ashokit.logical;

import java.util.Scanner;

/*Given two int values, return their sum. Unless the two values are the same, then return double their sum.

input ------> two int values
constraint--> n1>=0 and n2>=0
output -----> return sum or double sum*/
public class LBP044 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a n1 value ::");
		int n1 = sc.nextInt();
		System.out.println("Enter a n2 value ::");
		int n2 = sc.nextInt();

		if (n1 >= 0 && n2 >= 0) {
			if (n1 == n2)
				System.out.println((n1 + n2) * 2);
			else
				System.out.println((n1 + n2));
		}

	}

}
