package in.ashokit.logical;

import java.util.Scanner;

/*FunGames

The games development company "FunGames" has developed a ballon shooter games. The ballons are arranged in a linear sequence and 
each ballon has a number associated with it. The numbers on the ballons are fibonacci series. In the game the player shoots 'k' ballons . 
The player's score is the sum of numbers on k ballons.

Write an algorithm to generate the player's score.

input ----> an integer vlaue n
con ------> no
output ---> sum value

Ex:
    0 1 1 2 3 5 8 ......

    k=1 ===========> 0
    k=2 ===========> 0+1=1
    k=4 ===========> 0+1+1+2 = 4
*/
public class LBP257 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a k value ");
		int k = sc.nextInt(), s = 0, a1 = -1, a2 = 1, a3, i;
		for (i = 1; i <= k; i++) {
			a3 = a1 + a2;
			s = s + a3;
			a1 = a2;
			a2 = a3;
		}
		System.out.println(s);
	}
}
