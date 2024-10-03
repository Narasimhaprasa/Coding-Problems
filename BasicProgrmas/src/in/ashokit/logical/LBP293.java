package in.ashokit.logical;
/*sum of adjacent elements

Implement a program to find sum of adjacent elements in the array

input ----> an array size and elements
con ------> no
output ---> array with sum of adjacent elements*/

import java.util.Scanner;

public class LBP293 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size ::");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the values ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		sumAdjacentElements(a, size);
	}

	public static void sumAdjacentElements(int a[], int size) {
		int i, sum = 0;
		for (i = 0; i < size; i++) {
			sum = sum + a[i];
			System.out.print(sum + " ");
		}
	}
}
