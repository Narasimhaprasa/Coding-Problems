package com.nt.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * How do you find frequency of each character in a string using Java 8 streams?
 */
public class FindFreqOfChar {

	public static void main(String[] args) {
		String inputString = "hello";
		Map<Character, Long> collect = inputString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);

	}

}
