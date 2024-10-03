package in.ashokit.logical;

import java.util.Scanner;

/*sum of elements available at even index

Implement a program to find the sum of elements avaiable at even index locations in an array.

input ----> size and array elements
con ------> no
output ---> print sum value

Ex:
    5
    1 3 2 4 5
    0,1,2,3,4

    output: 1+2+5=8*/

public class LBP134 {

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
		calculateSumAtEvenIndex(a, size);
	}

	public static void calculateSumAtEvenIndex(int a[], int size) {
		int i, j, sum = 0;
		for (i = 0; i < size; i++) {
			if (i % 2 == 0) {
				sum = sum + a[i];
			}
		}
		System.out.println(sum);
	}
}
