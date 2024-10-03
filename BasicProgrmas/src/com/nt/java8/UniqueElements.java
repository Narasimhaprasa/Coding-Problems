package com.nt.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * How do you extract duplicate elements from an array?
 */
public class UniqueElements {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
		Set<Integer> uniqueElements = new HashSet<Integer>();
		listOfIntegers.stream().filter(i->!uniqueElements.add(i)).forEach(System.out::println);

	}

}
