package in.ashokit.logical;

import java.util.Scanner;

/*second smallest element in an array

Implement a program to read array elements and find the second min element in an array.


input -------> size and array elements.
con ---------> size<100
output ------> return second min element in array

formula ----> a[1]*/
public class LBP117 {

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
		int secondSmallEle = sortElementsInAscendingOrder(a, size);
		System.out.println("Second smallest element in the given array:::" + secondSmallEle);
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
		return a[size - size + 1];
	}
}
