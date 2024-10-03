package in.ashokit.logical;

import java.util.Scanner;

/*arrangement

given an array of size n, write a function to rearrange the numbers of the array in such that even and odd numbers are arranged 
alternatively in increasing order.

input -----> array size n and elements
con -------> no
output ----> updated array*/
public class LBP179 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size ::");
		int size = sc.nextInt();
		int[] a1 = new int[size];
		System.out.println("Enter a values ::");
		int i, j, k = 0;
		for (i = 0; i < size; i++) {
			int value = sc.nextInt();
			a1[i] = value;
		}
		int[] a = sort(a1, size);

		int b[] = new int[size / 2];
		for (i = 0; i < size; i++) {
			if (a[i] % 2 == 0)
				b[k++] = a[i];
		}
		int c[] = new int[size / 2 + 1];
		k = 0;
		for (j = 0; j < size; j++) {
			if (a[j] % 2 != 0)
				c[k++] = a[j];
		}
		i = 0;
		while (i < size / 2) {
			System.out.print(b[i] + " " + c[i] + " ");
			i++;
		}
	}

	public static int[] sort(int a[], int size) {
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
		return a;
	}
}
