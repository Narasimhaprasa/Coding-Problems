package com.nt.Interview.questions;

import java.util.Arrays;

public class ReplaceCharWithDigit {

	public static void main(String[] args) {
		String input = "opentext";
		char ch = 't';
		char[] chr = input.toCharArray();
		int count = 1;
		for (int i = 0; i < chr.length; i++) {
			if (chr[i] == ch) {
				chr[i] = String.valueOf(count).charAt(0);
				count++;
			}

		}
		String res = Arrays.toString(chr);
		System.out.println(res);

		// Approach 2
		int cnt = 1;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == ch) {
				input = input.replaceFirst(String.valueOf(ch), String.valueOf(cnt));
				cnt++;
			}
		}
		System.out.println(input);
	}

}
