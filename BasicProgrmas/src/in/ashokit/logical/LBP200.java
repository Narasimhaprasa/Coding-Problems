package in.ashokit.logical;

import java.util.Scanner;

/*Perfect Math

Perfect math is an online math program. In once of the assignments the system displays a list of N number and a value K, and students 
need to calculate the sum of remainders after dividing all the numbers from the list of N numbers by K. 
The system need to develop a program to calcualte the correct answer for the assignment.

Write an algorithm to calcualte the correct answer for the assignment.

input -----> size N and N elements and K value
con -------> no
output ----> an int value.
*/
public class LBP200 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size ::");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the values");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		System.out.println("Enter the k value ::");
		int k = sc.nextInt();

		int score = solveProblem(a, size, k);
		System.out.println("The answer for math program ::" + score);
	}

	public static int solveProblem(int a[], int size, int k) {
		int i, sum = 0;
		for (i = 0; i < size; i++) {
			sum = sum + a[i] % k;
		}
		return sum;
	}

}
