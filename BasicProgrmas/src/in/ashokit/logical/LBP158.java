package in.ashokit.logical;

import java.util.Scanner;

/*Positives and Negatives

Create a function which validates whether a given array alternates between positive and negative numbers.

input --------------> an array size and array
con ----------------> no
output -------------> true or false

Ex:
	5
	1 -2 3 -4 5
	true

	5
	1 -2 3 4 -5
	false*/

public class LBP158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size::");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the values ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		boolean isTrue = checkArray(a, size);
		System.out.println(isTrue);
	}

	public static boolean checkArray(int a[], int size) {
		int i;
		boolean flag = true;
		for (i = 0; i < size - 1; i++) {
			if (a[i] > 0 && a[i + 1] > 0) {
				flag = false;
				break;
			}
			if (a[i] < 0 && a[i + 1] < 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
