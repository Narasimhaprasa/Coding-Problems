package in.ashokit.logical;

import java.util.Scanner;

/*Airport Security officials have confiscated several items of the passenger at the security checkpoint. All the items have been dumped into a
huge box (array). Each item possessed a certain amount of risk (0, 1, 2). Here is the risk severity of the item representing an array [] of 
N number of integer values. The risk here is to sort the item based on their level of risk values range from 0 to 2.

input --------> array size and elements
contraint ----> non-empty array
output -------> sorted items based on risk

Ex:
   5
   1 5 2 4 3

   output ---> 1 2 3 4 5
*/
public class LBP303 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size ::");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the a[] values ::");
		int i;
		for (i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		LBP303 l = new LBP303();
		System.out.println("before sorting ::");
		l.printArray(a, size);
		l.sort(a, size);
		System.out.println("After sorting::");
		l.printArray(a, size);
	}

	public void sort(int a[], int size) {
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
	}

	public void printArray(int a[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
