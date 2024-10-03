package in.ashokit.logical;

import java.util.Scanner;

/*Find the Bomb

Write a function that finds the word "bomb" in the given string (not case sensitive) return "DUCK!" if found, else return "Relax there's no bomb."

input ---------> a string
constraint ----> no
output --------> "DUCK!" or "Relax, There's no bomb."
*/
public class LBP062 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ::");
		String str = sc.nextLine().toLowerCase();
		String word = "bomb";

		boolean isTrue = checkBomb(str, word);
		System.out.println((isTrue == true) ? "DUCK!" : "Relax , there is no bomb");
	}

	public static boolean checkBomb(String str1, String str2) {
		char[] chr1 = str1.toCharArray();
		char[] chr2 = str2.toCharArray();
		int i, j, k, len = str2.length();
		boolean flag = false;
		for (i = 0; i < chr1.length; i++) {
			k = i;
			for (j = 0; j < len; j++) {
				if (chr1[k] != chr2[j])
					break;
				k++;
			}
			if (j == len)
				flag = true;
		}
		return flag;
	}
}
