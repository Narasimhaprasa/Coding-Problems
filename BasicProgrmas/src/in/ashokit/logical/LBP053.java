package in.ashokit.logical;

import java.util.Scanner;

/*Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

input ------> a string from the user
constraint--> length>=2
output -----> new string

Ex:
    s = "welcome"

    mememe*/
public class LBP053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ::");
		String word = sc.nextLine();

		if (word.length() >= 2) {
			int count = 0;
			while (count < 3) {
				for (int i = word.length() - 2; i < word.length(); i++) {

					System.out.print(word.charAt(i));

				}
				count++;
			}
		} else {
			System.out.println("U need to enter more than two characters...!");
		}
		// System.out.println(s.substring(n-2,n)+s.substring(n-2,n)+s.substring(n-2,n));
	}

}
