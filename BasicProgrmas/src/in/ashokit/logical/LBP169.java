package in.ashokit.logical;

import java.util.Scanner;

/*Array to Matrix

Implement a program to convert an array into matrix.

input -----> array size and elements
con -------> element count should be 1,4,9,16,25 and so on
output ----> matrix

Ex:
	1 2 3 4

	1 2 
	3 4
*/

public class LBP169 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size::");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the array elements ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		convertArrayToMatrix(a, size);
	}

	public static void convertArrayToMatrix(int a[], int size) {
		int i, j, k = 0;
		int m = (int) Math.sqrt(size);
		for (i = 0; i < m; i++) {
			for (j = 0; j < m; j++) {
				System.out.print(a[k++] + " ");
			}
			System.out.println();
		}
	}

	/*	public static void convertArrayToMatrix(int a[], int size) {
			int i, j, k = 0;
			int b[][] = new int[size][size];
			for (i = 0; i < size; i++) {
				for (j = 0; j < size; j++) {
					b[i][j] = a[k++];
				}
			}
			printArray(b, size);
		}
	*/
	/*public static void printArray(int b[][], int size) {
		int i, j;
		for (i = 0; i < size; i++) {
			for (j = 0; j < size; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}*/
}
