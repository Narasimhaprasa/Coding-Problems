package com.nt.programs;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ::");
		String s = sc.nextLine().toLowerCase();
		checkPanagrams(s);
	}

	/*public static void checkPanagram(String s) {
		int[] freq = new int[26];
		int len = s.length();
		for (int i = 0; i < 26; i++) {
			freq[i] = 0;
		}
	
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) != ' ') {
				freq[s.charAt(i) - 'a']++;
			}
		}
		int temp = 0;
		for (int i = 0; i < 26; i++) {
			if (freq[i] == 0) {
				temp = 1;
				break;
			}
		}
		if(temp==1)
			System.out.println("not panagram");
		else
			System.out.println("panagram");
	}*/
	public static void checkPanagrams(String s) {
		int a[] = new int[26];
		char[] ch = s.toCharArray();
		int len = ch.length, i, j, temp = 0;
		for (i = 0; i < len; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				a[ch[i] - 'a']++;
			}
		}
		for (i = 0; i < 26; i++) {
			if (a[i] == 0) {
				temp = 1;
				break;
			}
		}
		if(temp==1)
			System.out.println("not pangram");
		else
			System.out.println("panagram");
	}
}
