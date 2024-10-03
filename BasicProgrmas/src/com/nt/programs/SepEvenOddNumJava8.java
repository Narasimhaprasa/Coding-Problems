package com.nt.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SepEvenOddNumJava8 {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(10, 30, 21, 34, 53, 23);
		
		List<Integer> evenNum = asList.stream().filter((i) -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers ::" + evenNum);

		List<Integer> oddNum = asList.stream().filter((i) -> i % 2 == 1).collect(Collectors.toList());
		System.out.println("Odd Numbers ::" + oddNum);

		Map<Boolean, List<Integer>> oddNumbers = asList.stream().collect(Collectors.partitioningBy((i) -> i % 2 == 1));
		System.out.println("OddNumbers ::: " + oddNumbers.get(true));

		Map<Boolean, List<Integer>> evenNumbers = asList.stream().collect(Collectors.partitioningBy((i) -> i % 2 == 0));
		System.out.println("Even Numbers ::" + evenNumbers.get(true));

		System.out.println(evenNumbers);

	}

}
