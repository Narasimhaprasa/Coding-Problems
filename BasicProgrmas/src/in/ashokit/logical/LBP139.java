package in.ashokit.logical;
/*Sort only First half of the elements

Implement a program to sort only first half of the array and keep remaining elements as original.

input ------> size and array elements
con --------> no
output -----> reverse only first half of the array

Ex:
    5
    4 1 3 5 2

    output:
            1 4 3 5 2*/

import java.util.Scanner;

public class LBP139 {

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
		sortHalfArray(a, size);
	}

	public static void sortHalfArray(int a[], int size) {
		int i, j, temp;
		for (i = 0; i < size / 2; i++) {
			for (j = i + 1; j < size / 2; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		printArray(a, size);
	}

	public static void printArray(int a[], int size) {
		int i;
		for (i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
