package in.ashokit.logical;

import java.util.Scanner;

/*A party has been organized on cruise. The party is organized for a limited time (T). The number of guests entering E[i] and leaving 
L[i] the party at every hour is represented as elements of the array. The task is to find the total number of guests present on the cruise at the end.

input -------> size of two arrays and elements of E and L array
constraint --> no
output ------> number of guests present at the end of party.*/
public class LBP302 {

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
		int b[] = new int[size];
		System.out.println("Enter the b[] values ");
		for (i = 0; i < size; i++) {
			int value = sc.nextInt();
			b[i] = value;
		}
		findPresentGuests(a, b, size);
	}

	public static void findPresentGuests(int a[], int b[], int size) {
		int i = 0, s1 = 0, s2 = 0;
		for (i = 0; i < size; i++)
			s1 = s1 + a[i];
		for (i = 0; i < size; i++)
			s2 = s2 + b[i];
		System.out.println("Number of guests present in the function::" + (s1 - s2));
	}
}
