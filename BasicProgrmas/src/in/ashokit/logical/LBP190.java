package in.ashokit.logical;

import java.util.Arrays;
import java.util.Scanner;

/*lucky draw

A person went to an exhibition. A lucky draw is going on, where one should buy a ticket. And if they ticket number appear on the screen, t
hat ticket will be considered as jackpot winner.

he knows the secret of picking up the ticket number, which will be considered for the jackpot.

1. sort the ticket number in the increasing order.
2. Now, the difference between the adjacent digits should not be more than 2.

If his ticket follows the above condition, then there are more chances to win the jackpot.

Given a ticket number, find whether the ticket is eligible to be part of jackpot or not. Print "Yes/No" based on the result.

input -----> ticket number
con -------> no
output ----> Yes or No
Ex:
	15243 ---> 12345 ---> Yes
	15943 ---> 13459 ---> No
*/
public class LBP190 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ::");
		int num = sc.nextInt(), i = 0;
		int a[] = new int[5];

		while (num != 0) {
			a[i++] = num % 10;
			num = num / 10;
		}
		Arrays.sort(a);
		boolean flag = true;
		for (i = 0; i < a.length - 1; i++) {
			if (Math.abs(a[i] - a[i + 1]) >= 2) {
				flag = false;
				break;
			}
		}
		System.out.println((flag == true) ? "Yes" : "No");
	}

}
