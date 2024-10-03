package in.ashokit.logical;

import java.util.Scanner;

/*Andy, Ben and Charlotte are playing a board game. The three of them decided to come up with a new scoring system. A player's first initial ("A","B" & "C") 
 * denotes that players scoring a single point. Given a string of capital letters. returns an array of the player's scores.

input --------------> A String
constraint ---------> No
output -------------> score

Ex:
	ABABCA ----> 3 2 1
	AAACCC ----> 3 0 3
	ABCABC ----> 2 2 2*/
public class LBP068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a score ::");
		String score = sc.nextLine();
		String res = checkScore(score);
		System.out.println(res);
	}

	public static String checkScore(String score) {
		char[] chr = score.toCharArray();
		int i, len = chr.length, aCnt = 0, bCnt = 0, cCnt = 0;
		for (i = 0; i < len; i++) {
			if (chr[i] == 'A')
				aCnt++;
			else if (chr[i] == 'B')
				bCnt++;
			else if (chr[i] == 'C')
				cCnt++;

		}
		return aCnt + " " + bCnt + " " + cCnt;
	}

}
