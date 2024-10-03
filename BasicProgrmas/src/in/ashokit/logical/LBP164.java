package in.ashokit.logical;

import java.util.Scanner;

/*Update Every Element

Implement a program to update every array element with multiplication of previous and next numbers in array.

input -----> size and array elements
con--------> no
output ----> updated array

Ex:
	5
	1 2 3 4 5 ===> 2 3 8 15 4*/
public class LBP164 {

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
		for (int i = 1; i < size - 1; i++) {
			System.out.print((a[i - 1] * a[i + 1]) + " ");
		}
		System.out.println(a[size - 2]);

	}

}
