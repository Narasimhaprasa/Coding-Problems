package in.ashokit.logical;

import java.util.Scanner;

/*A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array of n number of integer values. 
The task is to find the empty packets (0) of chocolate and push it to the end of the conveyor belt (array).

input -------> array size and elements
constraint---> non-empty array
output ------> updated array*/
public class LBP304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size ::");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the a[] values ::");
		int i;
		for (i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		findEmptyChocolates(a, size);
	}

	public static void findEmptyChocolates(int a[], int size) {
		int i;
		for (i = 0; i < size; i++) {
			if (a[i] != 0)
				System.out.print(a[i] + " ");
		}
		for (i = 0; i < size; i++) {
			if (a[i] == 0)
				System.out.print(a[i] + " ");
		}
	}
}
