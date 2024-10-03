package in.ashokit.logical;

import java.util.Scanner;

/*player's score

In a game, organizers has given a number to the player. The player has to find out the differnece between the number and the reverse 
of the number. The difference between two numbers is the player's score. The number given to the player and the player's score can be a
 negative or positive number.

Write an algorithm to find the player's score.

input ------> an integer 
con --------> no
output -----> player's score

Logic:
        formula: n-rev(n)*/
public class LBP255 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player score ::");
		int score = sc.nextInt();
		int reverseScore = reverse(score);
		System.out.println(score - reverseScore);
	}

	public static int reverse(int score) {
		int remainder, reverse = 0;
		while (score != 0) {
			remainder = score % 10;
			reverse = reverse * 10 + remainder;
			score = score / 10;
		}
		return reverse;
	}
}
