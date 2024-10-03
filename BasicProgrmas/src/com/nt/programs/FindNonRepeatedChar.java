package com.nt.programs;

public class FindNonRepeatedChar {

	public static void main(String[] args) {
		String word = "welcome";
		int i, j, len = word.length();
		boolean flag;
		for (i = 0; i < len; i++) {
			flag = true;
			for (j = i + 1; j < len; j++) {
				if (word.charAt(i) == word.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(word.charAt(i));
				break;
			}
		}
	}

}
