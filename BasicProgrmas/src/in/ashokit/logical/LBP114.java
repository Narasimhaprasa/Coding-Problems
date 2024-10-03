package in.ashokit.logical;

import java.util.Scanner;

/*min element in an array

Implement a program to read array elements and find the min element in an array.

input -------> size and array elements.
con ---------> size<100
output ------> return min element

fomula ----> a[0]
*/
public class LBP114 {

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
		int minElement = sortElementsInAscendingOrder(a, size);
		System.out.println("Minimum element in the given array::" + minElement);
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
		return a[size - size];
	}
}
