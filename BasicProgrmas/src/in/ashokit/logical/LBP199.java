package in.ashokit.logical;

import java.util.Scanner;

/*score of the player

a game developing company has developed a math game for kids called "Brain Fun". The game is for smartphone users and the player is given 
list of N positive numbers and a random number K. the player need to divide all the numbers in the list with random number k and then 
need to add all the quotients received in each division. the sum of all the quotients is the score of the player.

Write an algorithm to generate the score of the player.

input -----> array size, elements and random number k
con -------> no
output ----> an int value*/
public class LBP199 {

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

		int score = findScore(a, size, k);
		System.out.println("The score of the player is ::" + score);
	}

	public static int findScore(int a[], int size, int k) {
		int i, sum = 0;
		for (i = 0; i < size; i++) {
			sum = sum + a[i] / k;
		}
		return sum;
	}
}
