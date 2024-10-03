package in.ashokit.logical;

import java.util.Scanner;

/*binary search

Implement a program to search for an element in an array.

input -------> size, array elements and element to search
con ---------> size<100
output ------> search for the given element

Ex:
    5
    1 2 3 4 5
    2

    output ---> 1

    5
    1 3 4 5 2 => 1 2 3 4 5
    2

    output ---> 1 but not 4 */
public class LBP112 {

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
		System.out.println("Enter  the key element for searching :::");
		int key = sc.nextInt();
		int index = sortElementsInAscendingOrder(a, size, key);
		System.out.println(index);
	}

	public static int sortElementsInAscendingOrder(int a[], int size, int key) {
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
		int index = binarySearch(a, size, key);
		return index;
	}

	public static int binarySearch(int a[], int size, int key) {
		int index = -1, l = 0, h = size - 1, m;
		while (l <= h) {
			m = (l + h) / 2;
			if (key == a[m]) {
				index = m;
				break;
			} else if (key > a[m]) {
				l = m + 1;
			} else {
				h = m - 1;
			}
		}
		return index;
	}
}
