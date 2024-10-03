package in.ashokit.logical;
/*encrypted digits

A company trasfers an encrypted code to one of its clients. The code needed to be decrypted so that it can be used for accessing all the required 
information. The code can be decrypted by interchanging each consecutive digit and once if the digit got interchanged then it cannot be used again
. If at a certain point there is no digits to be interchanged with, then that single digit must be left as it is.

Write an algorithm to decrypt the code so that it can be used to access the required information.

input ------> a number from the user
con --------> no
output -----> an integer value*/

import java.util.Scanner;

public class LBP253 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a encrypted code ::");
		int encryptedCode = sc.nextInt();
		int a[] = new int[encryptedCode];
		System.out.println("Enter the values ::");
		for (int i = 0; i < encryptedCode; i++) {
			a[i] = sc.nextInt();
		}
		decryptCode(encryptedCode, a);
	}

	public static void decryptCode(int code, int a[]) {
		int i;
		if (code % 2 == 0) {
			for (i = 0; i < code; i = i + 2)
				System.out.print(a[i + 1] + " " + a[i] + " ");
		} else {
			for (i = 0; i < code - 1; i = i + 2)
				System.out.print(a[i + 1] + " " + a[i] + " ");
			System.out.print(a[i]);
		}
	}
}
