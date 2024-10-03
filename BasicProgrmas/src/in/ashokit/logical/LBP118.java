package in.ashokit.logical;

import java.util.Scanner;

/*number of occurrences of an element

Implement a program to find the number of occurrences of the given element.

input -------> size,array element and key element
con ---------> size<100
output ------> return number of occurrences

Ex:
    5
    1 2 1 2 3
    2

    ouput: 2

    5
    1 2 1 2 3
    3

    output: 1
*/
public class LBP118 {

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
		System.out.println("Enter a key element for finding occurance :::");
		int key = sc.nextInt();

		int keyOccuranceCnt = findingAccurranceOfKeyValue(a, size, key);
		System.out.println("Key occurrance count in the given array:::" + keyOccuranceCnt);
	}

	public static int findingAccurranceOfKeyValue(int a[], int size, int key) {

		int i, count = 0;
		for (i = 0; i < size; i++) {
			if (key == a[i]) {
				count++;
			}
		}
		return count;
	}
}
