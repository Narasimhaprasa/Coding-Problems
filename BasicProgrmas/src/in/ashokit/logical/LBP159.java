package in.ashokit.logical;
/*Check if All Values Are True

Write a function that returns true if all parameters are truthy, and false otherwise

input --------------> an array size and array
con ----------------> no
output -------------> true or false

Ex:
	5
	1 2 3 4 5
	true

	5
	1 2 3 0 5
	false*/

import java.util.Scanner;

public class LBP159 {

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
		boolean res = checkParameters(a, size);
		System.out.println(res);
	}

	public static boolean checkParameters(int a[], int size) {
		int i;
		boolean flag = true;
		for (i = 0; i < size; i++) {
			if (a[i] == 0) {
				flag = false;
				break;
			}
		}
		return (flag == true) ? true : false;
	}
}
