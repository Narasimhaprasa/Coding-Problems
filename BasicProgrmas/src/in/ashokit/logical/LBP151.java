package in.ashokit.logical;

import java.util.Scanner;

/*Write a program to calculate the sum of distances between the adjacent numbers in an array of positive integers.

input ---------> array size and array elements
constraint ----> 1<=size<=100
output --------> print sum of distances between adjacent numbers.

Ex:
    5
    10 11 7 12 14
    1+4+5+2=12

    5
    10 11 12 13 14
    1+1+1+1=4*/

public class LBP151 {

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
		int result = findAdjacentNumber(a, size);
		System.out.println(result);
	}

	public static int findAdjacentNumber(int a[], int size) {
		int i, sum = 0;
		for (i = 0; i < size - 1; i++) {
			if (a[i] >= 0) {
				sum = sum + Math.abs(a[i] - a[i + 1]);
			}
		}
		return sum;
	}
}
