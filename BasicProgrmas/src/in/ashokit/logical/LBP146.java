package in.ashokit.logical;

import java.util.Scanner;

/*Positive Count / Negative Sum

Create a function that takes an array of positive and negative numbers. Return an array where the first element is the count of positive numbers and 
the second element is the sum of negative numbers.

input -------> size and an array
con ---------> If given an empty array, return an empty array and 0 is not positive.
output ------> two space seperated int values.


Ex:
	5
	-1 2 3 -4 5
	3 -5

	5
	1 -2 3 -4 0
	2 -6*/
public class LBP146 {

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
		countElementsInArray(a, size);
	}

	public static void countElementsInArray(int a[], int size) {
		int i, positiveCnt = 0, negativeSum = 0;
		for (i = 0; i < size; i++) {
			if (a[i] > 0)
				positiveCnt++;
			if (a[i] < 0)
				negativeSum = negativeSum + a[i];
		}
		if (size == 0)
			System.out.println(" ");
		else
			System.out.println(positiveCnt + " " + negativeSum);
	}
}
