package in.ashokit.logical;

import java.util.Scanner;

/*Country Visa Center

The country visa center generates the token number for its applicants from their application ID. the application ID is numberic value. 
The token number is generated  in a specific form. the even digits in the applicant's ID are replaced by the digit one greater than the even 
digitand the odd digits in the applicant's ID are replaced by the digit one lesser than the odd digit. The numeric calue thus generated represents 
the token number of applicant.

Write an algorithm togenerate the token number from the applicant ID.

input -----> application ID
con -------> no
output ----> token id

Ex:
    345 ----> 254
    345 ----> 543 ---> 254*/

public class LBP275 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a application id ::");
		int id = sc.nextInt();
		int revNum = reverse(id), remainder;
		while (revNum != 0) {
			remainder = revNum % 10;
			if (remainder % 2 == 0)
				System.out.print(remainder + 1);
			else
				System.out.print(remainder - 1);
			revNum = revNum / 10;
		}
	}

	public static int reverse(int n) {
		int remainder, reverse = 0;
		while (n != 0) {
			remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
		}
		return reverse;
	}
}
