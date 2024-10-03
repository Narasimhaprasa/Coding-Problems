package com.nt.Interview.questions;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = " ja va Te       xt        ";
		char[] chr = str.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			char ch = str.charAt(i);
			if (Character.isWhitespace(ch))
				continue;
			else
				System.out.print(ch);
		}
		System.out.println();
		String r = str.replaceAll("\\s", "");
		System.out.println(r);
	}
}
