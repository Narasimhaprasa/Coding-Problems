package in.ashokit.logical;

import java.util.Scanner;

/*LBP129

number of duplicate elements in array

Implement a program to find the number of duplicate elements present in the given array.

input ------> size, array elements 
con --------> size<100
output -----> number of duplicate elements in the array

Ex:
	5
	1 2 1 2 3
	
	output: 2

	5
	1 1 1 2 3

	output: 1*/

public class LBP129 {

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
		int count = occurrenceCnt(a, size);
		System.out.println(count);
	}

	public static int occurrenceCnt(int a[], int size) {
		int i, count = 0;
		int[] b = new int[999];

		for (i = 0; i < size; i++) {
			b[a[i]]++;
		}
		for (i = 0; i < b.length; i++) {
			if (b[i] > 1)
				count++;
		}
		return count;
	}
}
