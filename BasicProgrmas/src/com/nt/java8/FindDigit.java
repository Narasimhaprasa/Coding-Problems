package com.nt.java8;

import java.util.Arrays;
import java.util.List;

/*
 * Given a list of strings, find out those strings which start with a number?
 */
public class FindDigit {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
		
		listOfStrings.stream().filter(i -> Character.isDigit(i.charAt(0))).forEach(System.out::println);

	}

}
