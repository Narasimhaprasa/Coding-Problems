package in.ashokit.logical;

import java.util.Scanner;

/*Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s. 
 * A shift on s consists of moving the leftmost character of s to the rightmost position. For example, if s = "abcde", then it will be "bcdea" after one shift.

input -------> string s1 and s2 from the user
constraint --> non empty string
output ------> true or false

Ex:
	s1="abc", s2="cba" ----> false
	s1="abc", s2 ="cab" ---> true
*/
public class LBP089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String s1 :::");
		String s1 = sc.nextLine();
		System.out.println("Enter a String s2::");
		String s2 = sc.nextLine();
		//boolean result = rotateStr(s1, s2);
		System.out.println((s1 + s1).contains(s2));
	}

	public static boolean rotateStr(String s1, String s2) {
		String s3 = s1 + s1;
		char[] chr = s3.toCharArray();
		char[] ch = s2.toCharArray();
		int i, j, count = 0, len = chr.length;
		j = 0;
		for (i = 0; i < len; i++) {

			if (chr[i] == ch[j]) {
				count++;
				j++;
			}

		}
		return (count == ch.length) ? true : false;
	}

}
