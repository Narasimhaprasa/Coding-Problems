package in.ashokit.logical;

import java.util.Scanner;

/*Create a function that takes two inputs: idx (an array of integers) and str (a string). The function should return another string with the letters of str 
 * at each index in idx in order.

input ----------> a string followed by size and an array
constraint -----> output must be in lower case but input many not be.
output ---------> a string contained in the specified locations given in the array.

Ex:
	idx = 1 3 0 2
	str = "welcome"
	       0123456
	s ---> ecwl

	formula: s[a[i]]
*/
public class LBP156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ::");
		String word = sc.nextLine();
		System.out.println("Enter the size of the array ::");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the index");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}

		for (int i = 0; i < size; i++) {
			System.out.print(word.charAt(a[i]));
		}
	}

}
