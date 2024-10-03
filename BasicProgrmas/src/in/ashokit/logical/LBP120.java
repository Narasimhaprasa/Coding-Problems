package in.ashokit.logical;

import java.util.Scanner;

/*inserting element at last position in an array
	
	Implement a program to insert an element into an array at the last position
	
	input -------> size,array elements and element to be inserted
	con ---------> size<100
	output ------> return array after insertion
	
	Ex:
	5
	1 2 3 4 5
	8
	
	output: 1 2 3 4 5 8*/

public class LBP120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of the array ::");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.println("Enter the values :::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		System.out.println("Enter a element to inserting at Last position ::");
		int ele = sc.nextInt();
		int[] e = insertElementLastPostion(a, size, ele);
		for (int i = 0; i <= size; i++) {
			System.out.print(e[i] + " ");
		}
	}

	public static int[] insertElementLastPostion(int a[], int size, int ele) {
		int i, index = 0;
		int b[] = new int[size + 1];
		for (i = 0; i < size; i++) {
			b[i] = a[i];
		}
		b[b.length - 1] = ele;
		return b;
	}
}
