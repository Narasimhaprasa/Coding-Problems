package com.nt.Interview.questions;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String str = "welcome";
		char[] chr = str.toCharArray();
		Arrays.sort(chr);
		System.out.print(Arrays.toString(chr));

	}

}
