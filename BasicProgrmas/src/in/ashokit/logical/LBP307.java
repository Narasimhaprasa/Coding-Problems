package in.ashokit.logical;

import java.util.Scanner;

/*A company wishes to encode its data. The data is in the form of a number. They wish to encode the data with respect to a specific digit. 
They wish to count the number of times the specific digit reoccurs in the given data so that they can encode the data accordingly. 
Write an algorithm to find the count of the specific digit in the given data.

input ---------> data and digit
constraint-----> no
output --------> count of specific digit*/
public class LBP307 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int n = sc.nextInt();
		System.out.println("Enter a digit based on the given number ::");
		int d = sc.nextInt();
		count(n, d);
	}

	public static void count(int n, int d) {
		int remainder, count = 0;
		while (n != 0) {
			remainder = n % 10;
			if (remainder == d)
				count++;
			n = n / 10;
		}
		System.out.println("count of the specific digit in the given  dats ::" + count);
	}

}
