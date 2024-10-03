package in.ashokit.logical;

import java.util.Scanner;

import com.nt.programs.UniqueElements;

/*Find the Single Number

Write a function that accepts an array of numbers (where each number appears three times except for one which appears only once) and 
finds that unique number in the array and returns it.

input -----------> array size and elements
con -------------> no
output ----------> return non-repeated number

Ex:
	6
	1 2 3 4 1 2 3 ===> 4*/

public class LBP163 {

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
		printUniqueElement(a, size);
	}

	public static void printUniqueElement(int a[], int size) {
		int i, j, u;
		for (i = 0; i < size; i++) {
			u = 0;
			for (j = 0; j < size; j++) {
				if (i != j && a[i] == a[j])
					u++;
			}
			if (u == 0)
				System.out.println(a[i]);
		}
	}

}
