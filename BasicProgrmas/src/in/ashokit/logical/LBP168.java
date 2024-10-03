package in.ashokit.logical;

import java.util.Scanner;

/*Array pliandrome

Implement a program to check whether an array is paliandrome or not.

input -----> Array size N and Array Elements
con -------> no
output ----> true or false

Ex:
	5
	123 234 5 234 123 ---> true

	5
	1 2 3 4 5 ----> false*/

public class LBP168 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array ::");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter a array elements ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		boolean isTrue = checkArray(a, size);
		System.out.println((isTrue == true) ? "true" : "False");
	}

	public static boolean checkArray(int a[], int size) {
		int i;
		boolean flag = false;
		for (i = 0; i < size; i++) {
			if (isPalindrome(a[i])) {
				flag = true;
			}
		}
		return flag;
	}

	public static boolean isPalindrome(int num) {
		int remainder, reverse = 0, temp = num;

		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		if (reverse == temp)
			return true;
		else
			return false;
	}
}
