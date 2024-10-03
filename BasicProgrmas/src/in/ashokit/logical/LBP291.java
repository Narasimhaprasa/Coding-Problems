package in.ashokit.logical;

import java.util.Scanner;

/*BucketId

A data company wishes to store its data files on the server. They N files. Each file has a particular size. the server stires the files in bucket list. 
The bucket ID is calculated as the sum of the digits of its file size. The server.. the bucket ID for every file request where the file is stored.

Write an algorithm to find the bucketIDs where the files are stored.

input -----> an array size and elements
con -------> no
output ----> bucketIds*/

public class LBP291 {

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
		for (int i = 0; i < size; i++)
			System.out.print(sum(a[i]) + " ");
	}

	public static int sum(int n) {
		int remainder, sum = 0;
		while (n != 0) {
			remainder = n % 10;
			sum = sum + remainder;
			n = n / 10;
		}
		return sum;
	}
}
