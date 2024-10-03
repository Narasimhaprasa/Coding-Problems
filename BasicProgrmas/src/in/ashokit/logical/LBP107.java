package in.ashokit.logical;

import java.util.Scanner;

/*sum of strong numbers in an array

Implement a program to read an array elements and print sum of all strong numbers in array.

input -------> size of the array and array elements 
con ---------> size<100 
output ------> sum of all strong numbers

Ex:
	145 
	1+24+120=145 Yes*/

public class LBP107 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of the array ::");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.println("Enter the values :::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		int sum = sumOfStrongNumbersInArray(a, size);
		System.out.println("sum of strong numbers in array ::" + sum);
	}

	public static int sumOfStrongNumbersInArray(int a[], int size) {
		int i, sum = 0;
		for (i = 0; i < size; i++) {
			if (a[i] == isStrongNum(a[i]))
				sum = sum + a[i];
		}
		return sum;
	}

	public static int isStrongNum(int num) {
		int i, remainder, f, s = 0;
		while (num != 0) {
			remainder = num % 10;
			f = 1;
			for (i = 1; i <= remainder; i++) {
				f = f * i;
			}
			s = s + f;
			num = num / 10;
		}
		return s;
	}

}
