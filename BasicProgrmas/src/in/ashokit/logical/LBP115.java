package in.ashokit.logical;

import java.util.Scanner;

/*diff between largest and smallest element in array

Implement a program to read array elements and find the difference between max and min element in an array.

input -------> size and array elements.
con ---------> size<100
output ------> return difference between max and min element.

formula ----> a[n-1]-a[0]*/
public class LBP115 {

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
		int diff = sortElementsInAscendingOrder(a, size);
		System.out.println("Difference between max and min element :::" + diff);
	}

	public static int sortElementsInAscendingOrder(int a[], int size) {
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
		return Math.abs(a[size - size] - a[size - 1]);
	}
}
