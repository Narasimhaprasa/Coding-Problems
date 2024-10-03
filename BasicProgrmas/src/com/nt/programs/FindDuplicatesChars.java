package com.nt.programs;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesChars {

	public static void main(String[] args) {
		String str = "DBQ Technologies Limited".toLowerCase();
		char[] chrArr = str.toCharArray();
		Set<Character> s = new HashSet<Character>();
		int i, j, len = str.length();
		for (i = 0; i < len; i++) {
			for (j = i + 1; j < len; j++) {
				if (chrArr[i] == chrArr[j]) {
					char ch = chrArr[i];
					if (ch != ' ') {
						s.add(ch);
						break;
					}
				}
			}
		}
		System.out.println(s);
	}

}
