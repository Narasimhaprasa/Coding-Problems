package in.ashokit.logical;

import java.util.Scanner;

/*Return the Sum of the Two Smallest Numbers

Create a function that takes an array of numbers and returns the sum of the two lowest positive numbers.

input -------> size and an array
con ---------> Dn't count negative numbers
output ------> sum of two smallest positive numbers

Ex:
	5
	4 2 -1 5 3
	5*/
public class LBP147 {

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
		sortArray(a, size);
	}

	public static void sortArray(int a[], int size) {
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
		for (i = 0; i < size; i++) {
			if (a[i] >= 0) {
				System.out.println(a[i] + a[i + 1]);
				break;
			}
		}
	}
}
