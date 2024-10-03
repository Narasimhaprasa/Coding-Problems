package in.ashokit.logical;

import java.util.Scanner;

/*Calculate the Mean

Implement a function that takes an array of numbers and returns the mean (average) of all those numbers.

input ----> an array size and elements
con ------> no
output ---> print mean value and round to two decimal places.*/
public class LBP283 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array ::");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the values ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		int total = sum(a, size);
		System.out.printf("%.2f",(float)total/size);
	}

	public static int sum(int a[], int size) {
		int i, sum = 0;
		for (i = 0; i < size; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
}
