package in.ashokit.logical;

import java.util.Scanner;

public class LBP011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int num = sc.nextInt(), remainder, sum = 0;
		while (num != 0) {
			remainder = num % 10;
			if (remainder == 2 || remainder == 3 || remainder == 5 || remainder == 7)
				sum = sum + remainder;
			num = num / 10;

		}
		System.out.println(sum);

	}

}
