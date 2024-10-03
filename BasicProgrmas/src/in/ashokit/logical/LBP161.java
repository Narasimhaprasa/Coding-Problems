package in.ashokit.logical;

import java.util.Scanner;

/*Combined Consecutive Sequence

Write a function that returns true if two arrays, when combined, form a consecutive sequence. 
A consecutive sequence is a sequence without any gaps in the integers, 
e.g. 1, 2, 3, 4, 5 is a consecutive sequence, but 1, 2, 4, 5 is not.


input --------> two array sizes and array elements
con ----------> no
output -------> true or false

Ex:
	5
	1 2 3 4 5
	4
	9 8 7 6

	1 2 3 4 5 9 8 7 6 ===> 1 2 3 4 5 6 7 8 9 ===> true

	5
	1 2 3 4 5
	3
	9 8 7

	1 2 3 4 5 9 8 7 ==> 1 2 3 4 5 7 8 9 ====> false
*/
public class LBP161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a a[] size ::");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter a a[] values ::");
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		System.out.println("Enter a b[] size ::");
		int m = sc.nextInt();
		int b[] = new int[m];
		System.out.println("Enter a b[] values ::");
		for (int i = 0; i < m; i++) {
			int value = sc.nextInt();
			b[i] = value;
		}
		boolean res = copyArray(a, b, n, m);
		System.out.println(res);
	}

	public static boolean copyArray(int a[], int b[], int n, int m) {
		int i, j = 0, count = 0;
		int[] c = new int[n + m];
		for (i = 0; i < n; i++) {
			c[j++] = a[i];
		}
		i = 0;
		for (i = 0; i < m; i++) {
			c[j++] = b[i];
		}
		sort(c, c.length);
		for (i = 0; i < c.length - 1; i++) {
			if (c[i] + 1 == c[i + 1]) {
				count++;
			}
		}
		return (count == c.length - 1) ? true : false;
	}

	public static void sort(int c[], int size) {
		int i, j, temp;
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (c[i] > c[j]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
	}
}
