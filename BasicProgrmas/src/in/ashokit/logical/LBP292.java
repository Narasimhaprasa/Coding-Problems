package in.ashokit.logical;

import java.util.Scanner;

/*Decimal to Octal

Implement a program to convert the given decimal value into octal

input ------> decimal value
con --------> no
output -----> octal number*/

public class LBP292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number ::");
		int num = sc.nextInt(), i;
		int[] a = new int[100];
		i = 0;
		while (num != 0) {
			a[i++] = num % 8;
			num = num / 8;
		}
		for (i = i - 1; i >= 0; i--)
			System.out.print(a[i] + " ");
	}

}
