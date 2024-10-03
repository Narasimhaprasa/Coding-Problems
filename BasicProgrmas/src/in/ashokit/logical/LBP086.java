package in.ashokit.logical;

import java.util.Scanner;

/*Someone has attempted to censor my strings by replacing every vowel with a *, l*k* th*s. Luckily, I've been able to find the vowels that were removed.

Given a censored string and a string of the censored vowels, return the original uncensored string.

input ---------> censored string and removed vowels as string
constraint ----> non-empty string
output --------> updated string

Ex:
	l*k* th*s, iei ----> like this
	p*akas*, rh -------> prakash*/
public class LBP086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a censored string ::");
		String s1 = sc.nextLine();
		System.out.println("Enter a censord vowels in the string ::");
		String s2 = sc.nextLine();
		String result = replaceCensoredVowels(s1, s2);
		System.out.println(result);
	}

	public static String replaceCensoredVowels(String s1, String s2) {
		int i, j = 0, len = s1.length();
		String res = "";
		for (i = 0; i < len; i++) {

			if (s1.charAt(i) == '*')
				res = res + s2.charAt(j++);
			else
				res = res + s1.charAt(i);
		}
		return res;
	}

}
