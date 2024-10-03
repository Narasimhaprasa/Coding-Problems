package in.ashokit.logical;

import java.util.Scanner;

/*you are playing an online game. In the game, a list of N numbers is given. The player has to arrange the numbers so that all the odd numbers of the list 
 * come after even numbers. Write an algorithm to arrange the given list such that all the odd numbers of the list come after the even numbers.

input ---------> array size and array elements.
constraint ----> 1<=size<=100.
output --------> modified array.


Ex:
    5
    1 2 3 4 5
    2 4 1 3 5*/
public class LBP152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :::");
		int size = sc.nextInt();

		int[] a = new int[size];
		System.out.println("Enter a[] the values ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		printOddNumbersAfterEvenNumberList(a, size);
	}

	public static void printOddNumbersAfterEvenNumberList(int a[], int size) {
		int i;
		for (i = 0; i < size; i++) {
			if (a[i] % 2 == 0)
				System.out.print(a[i] + " ");
		}

		for (i = 0; i < size; i++) {
			if (a[i] % 2 != 0)
				System.out.print(a[i] + " ");
		}
	}
}
