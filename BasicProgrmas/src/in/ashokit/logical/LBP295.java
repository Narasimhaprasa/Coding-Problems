package in.ashokit.logical;

import java.util.Scanner;

public class LBP295 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a radius::");
		int radius = sc.nextInt();
		System.out.printf("%.2f", 3.141592653589793 * radius * radius);
	}

}
