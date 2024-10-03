package in.ashokit.logical;
/*Kth SHORTEST PROCESSING QUEUE

A company wishes to modify the technique by which tasks in the processing queue are
 executed. There are N processes with unique ID's from 0 to N-1. Each of these tasks has 
 its own execution time. The company wishes to implement a new algorithm for processing tasks. 
 for this purpose they have identified a value K by the new algorithm, the processor will first process the task that has the Kth shortest execution time.

Write an algorithm to find the Kth shortest execution time.

input ----> array size, k value and array
output ---> kth shortest execution time.*/

import java.util.Arrays;
import java.util.Scanner;

public class LBP155 {

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
		System.out.println("Enter a kth element ::");
		int k = sc.nextInt();
		findKthSmallestElement(size, a, k);
	}

	public static void findKthSmallestElement(int size, int a[], int k) {
		Arrays.sort(a);
		System.out.println(a[k - 1]);
	}
}
