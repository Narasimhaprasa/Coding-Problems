package com.nt.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 *  Find first repeated character in a string?
 */
public class FirstRepeatedChar {
	public static void main(String[] args) {
		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
		LinkedHashMap<String, Long> collect = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(collect);
		
		String res = collect.entrySet().stream().filter(entry-> entry.getValue()>1).map(entry->entry.getKey()).findFirst().get();
		System.out.println(res);
		
		String  nonRepeatedChar = collect.entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()).findFirst().get();
		System.out.println("Non repeated character :: "+nonRepeatedChar);
	}
}
