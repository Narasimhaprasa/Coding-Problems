package in.ashokit.logical;

import java.util.Scanner;

/*replace every element with the greatest element on its right side

Implement a program to read an array and replace every element with the greatest element on its right side.

input ------> size, array elements 
con --------> size<100
output -----> print updated array elements

Ex:
	5
	1 2 1 2 4

	output: 4 4 4 4 4*/

public class LBP132 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :::");
		int size = sc.nextInt();

		int[] a = new int[size];
		System.out.println("Enter the values ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		replaceWithRightSideEle(a, size);
	}

	public static void replaceWithRightSideEle(int a[], int size) {
		int i, j, max;
		for (i = 0; i < size; i++) {
			max = a[i];
			for (j = i + 1; j < size; j++) {
				if (max < a[j]) {
					max = a[j];
				}
			}
			System.out.print(max + " ");
		}
	}
}
