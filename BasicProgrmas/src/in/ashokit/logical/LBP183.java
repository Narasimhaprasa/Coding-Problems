package in.ashokit.logical;
/*product with successor

Given an integer N and integer array A as the input, where N denotes the length of A 
write a program to find an integer the sum of all these product with successors.


input ----> array size and elements
con-------> no
output ---> an int value

Ex:
	5
	1 2 1 3 5 ---> 1*2 + 2*3 + 1*2 + 3*4 + 5*6 ---> 2+6+2+12+30=52*/

import java.util.Scanner;

public class LBP183 {

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
		int res = findProduct(a, size);
		System.out.println(res);
	}

	public static int findProduct(int a[], int size) {
		int i, sum = 0;
		for (i = 0; i < size; i++) {
			sum = sum + a[i] * (a[i] + 1);
		}
		return sum;
	}
}
