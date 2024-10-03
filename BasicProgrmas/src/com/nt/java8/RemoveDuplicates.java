package com.nt.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * how to remove duplicate values from a list using java 8 streams
 */
public class RemoveDuplicates {
	public static void main(String[] args) {
     
		List<String> asList = Arrays.asList( "Java","Python","C#","Java","Kotlin","Python");
		List<String> collect = asList.stream().distinct().collect(Collectors.toList());
		collect.forEach(System.out :: println);
	}
}
