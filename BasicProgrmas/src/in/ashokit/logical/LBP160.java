package in.ashokit.logical;
/*Create a function that returns true if each pair of adjacent numbers in an array shares at least one digit and false otherwise.

input --------> array size and array elements
con ----------> no
output -------> true or false

Ex:
	5
	123 356 388 890 102
	true

	5
	123 456 388 890 102
	false*/

import java.util.Scanner;

public class LBP160 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size::");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the values ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		boolean res = checkAdjecentNumber(a, size);
		System.out.println(res);
	}

	public static boolean checkAdjecentNumber(int a[], int size) {
		int i, temp, digit, count = 0;
		for (i = 0; i < size - 1; i++) {
			temp = a[i];
			while (temp != 0) {
				digit = temp % 10;
				if (contains(digit, a[i + 1])) {
					count++;
					break;
				}
				temp = temp / 10;
			}
		}
		return (count == size - 1) ? true : false;
	}

	public static boolean contains(int digit, int n) {
		int remainder;
		while (n != 0) {
			remainder = n % 10;
			if (digit == remainder)
				return true;
			n = n / 10;
		}
		return false;
	}

}
