package com.nt.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Print duplicate characters in a string?
 */
public class PrintDupChars {

	public static void main(String[] args) {

		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
		System.out.println(inputString);
		Set<String> set = new HashSet<String>();
		Set<String> collect = Arrays.stream(inputString.split("")).filter(ch -> !set.add(ch)).collect(Collectors.toSet());
		System.out.println(collect);

	}

}
