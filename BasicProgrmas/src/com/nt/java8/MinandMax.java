package com.nt.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Given a list of integers, find maximum and minimum of those numbers?
 */
public class MinandMax {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		Integer max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
		System.out.println(max);
		
		Integer min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
		System.out.println(min);
	}

}
