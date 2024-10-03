package in.ashokit.logical;

import java.util.Scanner;

/*SEVEN BOOM!

Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".

input ---------> an array from the user
constraint ----> no
output --------> Boom! or "there is no 7 in the array".*/
public class LBP157 {

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
		String res = findSevenInarray(a, size);
		System.out.println(res);
	}

	public static String findSevenInarray(int a[], int size) {
		int i;
		boolean flag = false;
		for (i = 0; i < size; i++) {
			if (contains(a[i])) {
				flag = true;
				break;
			}
		}
		return (flag == true) ? "Boom!" : "There is no 7 in the given array..!";
	}

	public static boolean contains(int num) {
		int remainder;
		while (num != 0) {
			remainder = num % 10;
			if (remainder == 7)
				return true;
			num = num / 10;
		}
		return false;
	}
}
