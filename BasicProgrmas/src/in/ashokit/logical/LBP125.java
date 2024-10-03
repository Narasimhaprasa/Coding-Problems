package in.ashokit.logical;

import java.util.Scanner;

/*update an element in an array

Implement a program to update an element in the given array

input ------> size,array elements and element to be updated (old element & new element)
con---------> size<100
output -----> return array after updating

Ex:
	5
	1 2 3 4 5
	3
	999

	output: 1 2 999 4 5
*/
public class LBP125 {

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
		System.out.println("Enter a old element ::");
		int oldEle = sc.nextInt();
		System.out.println("Enter a new element ::");
		int newEle = sc.nextInt();

		int[] e = updateArray(a, size, oldEle, newEle);
		for (int i = 0; i < size; i++) {
			System.out.print(e[i] + " ");
		}
	}

	public static int[] updateArray(int a[], int size, int old, int newEle) {
		int i;
		for (i = 0; i < size; i++) {
			if (a[i] == old) {
				a[i] = newEle;
				break;
			}
		}
		return a;
	}
}
