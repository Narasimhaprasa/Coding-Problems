package in.ashokit.logical;

import java.util.Scanner;

/*sort the elements in an array ASC

Implement a program to sort the given array elements in ASC order.

input -----> size and array elements
con -------> size<100
output ----> sorted array in ASC


Ex:
    5
    1 5 2 4 3

    output ---> 1 2 3 4 5*/
public class LBP110 {

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
		int[] values = sortElementsInAscendingOrder(a, size);
		for (int i = 0; i < size; i++) {
			System.out.print(values[i] + " ");
		}
	}

	public static int[] sortElementsInAscendingOrder(int a[], int size) {

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
		//traverseElements(a, size);
		return a;
	}

	public static int[] traverseElements(int a[], int size) {
		int b[] = new int[size];
		for (int i = 0; i < size; i++) {
			b[i] = a[i];
		}
		return b;
	}
}
