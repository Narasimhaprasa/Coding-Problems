package in.ashokit.logical;

import java.util.Scanner;

/*A company is transmitting data to another server. 
The data is in the form of numbers. 
To secure the data during transmission, 
they plan to obtain a security key that will be sent along with the data. 
The security key is identified as the count of the repeating digits in the data. 
Write a algorithm to find the security key for the data.

input --------> integer data to be transmitted
constraint ---> no
output -------> security key or -1*/
public class LBP306 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int n = sc.nextInt();
		findSecurityKey(n);
	}

	public static void findSecurityKey(int n) {
		int remainder, i, c = 0;
		int a[] = new int[10];
		while (n != 0) {
			remainder = n % 10;
			a[remainder]++;
			n = n / 10;
		}
		for (i = 0; i < 10; i++) {
			if (a[i] >= 2)
				c++;
		}
		System.out.println((c != 0) ? c : -1);
	}
}
