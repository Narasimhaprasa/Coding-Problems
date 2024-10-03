package in.ashokit.logical;

import java.util.Scanner;

/*The Actual Memory Size of Your USB Flash Drive

Implement a program that takes the memory size as an argument and returns the actual memory size.

Note: The actual storage loss on a USB device is 7% of the overall memory size!

input -----> memory size in GB
con -------> no
output ----> actual memory size, round your result to two decimal places.

Ex:
    1GB ----> 0.93GB ---> 0.07 is loss ----> 7%*/
public class LBP281 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a n number ::");
		int n = sc.nextInt();
		System.out.printf("%.2f", n - n * 0.07);
	}

}
