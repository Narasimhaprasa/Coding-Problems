package in.ashokit.logical;

import java.util.Scanner;

/*The IT Company "Soft ComInfo" has decided to transfer its messages through the N/W using new encryption technique.
 *  The company has decided to encrypt the data using the non-prime number concept. 
 *  The message is in the form of a number and the sum of non-prime digits present in the message is used as the encryption key.

Write an algorithm to determine the encryption key.

Note: 0 and 1 are considered as prime numbers.*/
public class LBP035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int plainMessage = sc.nextInt(), remainder, sum = 0;

		while (plainMessage != 0) {
			remainder = plainMessage % 10;
			if (remainder == 4 || remainder == 6 || remainder == 8 || remainder == 9)
				sum = sum + remainder;
			plainMessage = plainMessage / 10;
		}
		System.out.println("Encryption key is ::"+sum);

	}

}
