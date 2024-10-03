package com.nt.java8;

import java.util.stream.IntStream;

/*
 * Palindrome program using Java 8 streams
 */
public class Palindrome {

	public static void main(String[] args) {
		String str = "racecar";
		boolean istrue = IntStream.range(0, str.length())
				.noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
		if (istrue)
			System.out.println("It is palindrome");
		else
			System.out.println("it is not palindrome");

	}

}
