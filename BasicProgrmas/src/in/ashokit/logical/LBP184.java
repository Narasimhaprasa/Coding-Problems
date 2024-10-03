package in.ashokit.logical;

import java.util.Arrays;
import java.util.Scanner;

/*pre-sorted integers in array

You are given an array of integers, a of size n, Your task is to find the number of elements whose positions will remain unchanged after
 sorted in ascending order.

input ----> array size and elements
con ------> no
output ---> unchanged count

Ex:
	5
	1 5 2 4 3
	1 2 3 4 5*/
public class LBP184 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size ::");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the values::;");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		int b[] = new int[size];
		for (int i = 0; i < size; i++)
			b[i] = a[i];
		Arrays.sort(b);
		int c = 0;
		for (int i = 0; i < size; i++) {
			if (a[i] == b[i])
				c++;
		}
		System.out.println(c);
	}

}
