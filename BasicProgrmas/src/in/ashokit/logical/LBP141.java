package in.ashokit.logical;

import java.util.Scanner;

/*rearrange an array in such an order that– smallest, largest, 2nd smallest, 2nd largest and on

Implement a program to rearrange an array in such an order that- smallest,largest,2nd smallest, 2nd largest and so on.

input ------> size and array elements
con --------> no
output -----> print the elements smallest,largest,2nd smallest,2nd largest and so on.


Ex:
    5
    3 1 2 5 4

    output: 1 5 2 4 3 3

    6
    3 1 2 6 4 5

    output: 1 6 2 5 3 4
*/
public class LBP141 {

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
		rearrangeArray(a, size);
	}

	public static void rearrangeArray(int a[], int size) {
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
		printArray(a, size);
	}

	public static void printArray(int a[], int size) {
		int low = 0, high = size - 1;
		while (low <= high) {
			System.out.print(a[low] + " " + a[high] + " ");
			low++;
			high--;
		}
	}
}
