package com.nt.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * How do you get three maximum numbers and three minimum numbers from the given list of integers?
 */
public class PrintThreeMaxMin {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		List<Integer> min = listOfIntegers.stream().sorted().limit(3).collect(Collectors.toList());
		System.out.println(min);
		
		List<Integer> max = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		System.out.println(max);

	}

}
