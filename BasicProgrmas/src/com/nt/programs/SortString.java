package com.nt.programs;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String str = "BBBAAACCC";

		char[] charArray = str.toCharArray();

		 Arrays.sort(charArray);
		 
		 System.out.println(charArray);
	}

}
