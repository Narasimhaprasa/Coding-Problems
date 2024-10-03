package in.ashokit.logical;
/*print unique elements in array

Implement a program to find the unique elements present in the given array.

input ------> size, array elements 
con --------> size<100
output -----> print unique elements present in the array

Ex:
	5
	1 1 2 3 4

	output: 1 2 3 4*/

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class LBP130 {

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
		printUniqueElements(a, size);

	}

	public static void printUniqueElements(int a[], int size) {
		int i, j;
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (a[i] == a[j]) {
					break;
				}
			}
			if (j == size)
				System.out.print(a[i] + " ");
		}
	}
}
