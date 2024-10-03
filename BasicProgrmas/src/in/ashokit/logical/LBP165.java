package in.ashokit.logical;

import java.util.Scanner;

/*Third Largest and Second smallest 

Given an integer array and an integer N denoting the array length as input. your task is to return the sum of third largest and second minimum elements
 of the array.

input ------> array size and array elements
con --------> no
output -----> an int value

sort the array
formula: a[n-3]+a[1]*/
public class LBP165 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size :::");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter a array elements  ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		sort(a, size);
	}

	public static void sort(int a[], int size) {
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
		System.out.println((a[size - 3] + a[1]));
	}
}
