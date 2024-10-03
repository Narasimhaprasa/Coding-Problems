package in.ashokit.logical;

import java.util.Scanner;

/*An e-commerce site wishes to enhance its ordering process. They plan to implement a new scheme of OTP generation for order confirmations. 
The OTP can be any number of digits. For OTP generation, the user will be asked for two random numbers where first number is always smaller 
than second number. The OTP is calculated as the sum of the maximum and minimum prime values in the range of the user-entered numbers.
 Write a program to generate OTP.

input ---------> two integer values 
constraint ----> first number < second number
output --------> sum of max and min prime numbers*/
public class LBP308 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a n1 value ::");
		int n1 = sc.nextInt();
		System.out.println("Enter a n2 value ::");
		int n2 = sc.nextInt();
		int s1, s2;

		while (true) {
			if (isPrime(n1)) {
				s1 = n1;
				break;
			}
			n1++;
		}
		while (true) {
			if (isPrime(n2)) {
				s2 = n2;
				break;
			}
			n2--;
		}
		System.out.println(s1 + s2);
	}

	public static boolean isPrime(int num) {
		int i, f = 0;
		for (i = 1; i <= num; i++) {
			if (num % i == 0)
				f++;
		}
		return f == 2;
	}

}
