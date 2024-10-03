package in.ashokit.logical;

import java.util.Scanner;

/*print reverse of each number in an array

Implement a program to print reverse of each element in an array

input -----> size and array elements
con -------> no
output ----> print reverse of each element in an array

Ex:
    5
    13 123 78 99 121

    output: 31 321 87 99 121
*/
public class LBP137 {

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
		reverseEachElement(a, size);
	}

	public static void reverseEachElement(int a[], int size) {
		int i;
		for (i = 0; i < size; i++) {
			System.out.print(reverse(a[i]) + " ");
		}
	}

	public static int reverse(int num) {
		int remainder, reverse = 0;
		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		return reverse;
	}
}
