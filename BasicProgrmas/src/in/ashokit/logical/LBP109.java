package in.ashokit.logical;

import java.util.Scanner;

/*search for an element in an array

Implement a program to search for an element in an array.

input -------> size, array elements and element to search
con ---------> size<100
output ------> search for the given element

Ex:
    5
    1 5 3 2 4
    3

    output ---> 2

    5
    1 5 3 2 4
    8*/
public class LBP109 {

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
		System.out.println("Enter a key ::");
		int key = sc.nextInt();

		int result = searchElement(a, size, key);
		System.out.println("search an element in a given array ::" + result);
	}

	public static int searchElement(int a[], int size, int key) {
		int i, index = -1;
		for (i = 0; i < size; i++) {
			if (key == a[i]) {
				index = i;
				break;
			}
		}
		return index;
	}

}
