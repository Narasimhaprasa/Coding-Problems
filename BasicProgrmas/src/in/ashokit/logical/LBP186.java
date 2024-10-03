package in.ashokit.logical;

import java.util.Scanner;

/*half ascending and half descending

You are given a list of integers of size N, 
write an algorithm to sort the first K elements of the list in ascending order and 
the remaining elements in descending order.

input -----> an arry size and elements
con -------> no
output ----> updated array

Ex:
	5
	1 5 2 4 3 ---> 1 2 3 4 5 ---> 1 2 5 4 3*/

public class LBP186 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size ::");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the values::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		sort(a, size);
	}

	public static void sort(int a[], int size) {
		int i, j, temp;
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (i = 0; i < size / 2; i++) {
			System.out.print(a[i] + " ");
		}
		for (j = size - 1; j >= size / 2; j--) {
			System.out.print(a[j] + " ");
		}
	}

}
