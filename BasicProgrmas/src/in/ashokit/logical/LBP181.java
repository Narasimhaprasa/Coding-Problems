package in.ashokit.logical;

import java.util.Scanner;

/*second non-repeating character

sofia loved to play with the programs unfortunately. she got stuck in one of the questions. she tought to take help of james. james asked her the problem 
statement. The problem statement was.

"for the given string S of length N consist of stream of character not in predefined order. Write a program to find second non-repeating 
character in a string S. Write a program to help sofia and james for the given problem statements.

input ------> string from the user
con --------> no
outptu -----> single character

Ex:
	welcome ---> wlco ---> l
	india -----> nda ----> d
	indian ----> da -----> a*/
public class LBP181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ::");
		String word = sc.nextLine();
		findSecondNonRepeatingCharacter(word);
	}

	public static void findSecondNonRepeatingCharacter(String word) {
		int i, j, len = word.length(), count = 0;
		boolean flag;
		for (i = 0; i < len; i++) {
			flag = true;
			for (j = 0; j < len; j++) {
				if (i != j && word.charAt(i) == word.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				count++;
				if (count == 2) {
					System.out.println(word.charAt(i));
					break;
				}
			}
		}
	}

}
