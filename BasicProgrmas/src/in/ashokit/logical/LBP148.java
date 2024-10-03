package in.ashokit.logical;

import java.util.Scanner;

/*Retrieve the Last N Elements

Write a function that retrieves the last n elements from an array.

input -------> size, an array and N value
con ---------> return 0 if n exceeds size of the array
output ------> last N elements

Ex:
	n = 5
	1 2 3 4 5
	3
	3 4 5

	5
	1 2 3 4 5
	6
	0*/
public class LBP148 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :::");
		int size = sc.nextInt();

		int[] a = new int[size];
		System.out.println("Enter a[] the values ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		System.out.println("Enter the starting range to retrieve elements ::");
		int key = sc.nextInt();

		printArray(a, size, key);
	}

	public static void printArray(int a[], int size, int key) {
		int i;
		if (key < size) {
			for (i = size - key; i < size; i++) {
				System.out.print(a[i] + " ");
			}
		} else {
			System.out.println("0");
		}
	}
}
