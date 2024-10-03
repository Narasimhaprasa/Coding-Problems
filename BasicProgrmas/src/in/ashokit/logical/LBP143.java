package in.ashokit.logical;
/*Inclusive Array Ranges

Write a function that, given the start startNum and end endNum values, return an array containing all the numbers inclusive to that range. 

Note:
The numbers in the array are sorted in ascending order.
If startNum is greater than endNum, return an array with the higher value. 

input -----> n and m values
con -------> no
output ----> return an array with elements from n to m.


Ex:
    n1 = 5
    n2 = 10

    output: 5 6 7 8 9 10

    n1 = 5
    n2 = 4

    output: 5*/

import java.util.Scanner;

public class LBP143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a n1 value ::");
		int n1 = sc.nextInt();
		System.out.println("Enter a n2 value ::");
		int n2 = sc.nextInt();

		printValuesUptoRange(n1, n2);
	}

	public static void printValuesUptoRange(int n1, int n2) {
		if (n1 <= n2) {
			for (int i = n1; i <= n2; i++) {
				System.out.print(i + " ");
			}
		} else
			System.out.println(n1);
	}
}
