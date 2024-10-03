package in.ashokit.logical;
/*delete an element from an array 

Implement a program to delete the given element from an array 

input -------> size,array elements and element
con ---------> size<100
output ------> return array after deleting

Ex:
	5
	11 22 33 44 55
	44

	output: 11 22 33 55

	5
	11 22 33 44 55
	66*/

import java.util.Scanner;

public class LBP124 {

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
		System.out.println("Enter  an element to delete ::");
		int ele = sc.nextInt();
		removeElementInArray(a, size, ele);
	}

	public static void removeElementInArray(int a[], int size, int ele) {
		int i, loc = -1;
		for (i = 0; i < size; i++) {
			if (a[i] == ele) {
				loc = i;
				break;
			}
		}
		if (loc != -1) {
			for (int j = loc; j < size - 1; j++)
				a[j] = a[j + 1];
		}
		if (loc != -1) {
			for (int k = 0; k < size - 1; k++) {
				System.out.print(a[k] + " ");
			}
		} else
			System.out.println("-1");
	}

}
