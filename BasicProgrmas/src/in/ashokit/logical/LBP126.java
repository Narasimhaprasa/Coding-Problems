package in.ashokit.logical;

import java.util.Scanner;

/*update an element in an array

Implement a program to update an element in the given array based on position

input ------> size,array elements and element to be updated and location
con---------> size<100
output -----> return array after updating

Ex:
	5
	1 2 3 4 5
	0
	888

	output: 888 2 3 4 5
*/
public class LBP126 {

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
		System.out.println("Enter a location of an element to replace ::");
		int loc = sc.nextInt();
		System.out.println("Enter a element ::");
		int newEle = sc.nextInt();

		updateEleLoc(a, size, loc, newEle);
	}

	public static void updateEleLoc(int a[], int size, int loc, int newEle) {
		if (loc < size)
			a[loc] = newEle;
		int i;
		for (i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
