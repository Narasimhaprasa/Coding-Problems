package in.ashokit.logical;

import java.util.Scanner;

/*sum of first and last, second and second last and so on

Implement a program to find the sum of first and last, second and second last and so on in an array.

input -----> size and array elements
con -------> no
output ----> print sum of first and last, second and second last and so on

Ex:
    5
    1 2 3 4 5

    output: 6 6 6

    6
    1 2 3 4 5 6

    output: 7 7 7*/

public class LBP136 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :::");
		int size = sc.nextInt();

		int[] a = new int[size];
		System.out.println("Enter the values ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		printSum(a, size);
	}

	public static void printSum(int a[], int size) {
		int low = 0, high = size - 1;
		while (low <= high) {
			System.out.print((a[low] + a[high]) + " ");
			low++;
			high--;
		}
	}
}
