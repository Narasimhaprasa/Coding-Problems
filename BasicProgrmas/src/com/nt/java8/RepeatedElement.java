package com.nt.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * How do you find the most repeated element in an array?
 */
public class RepeatedElement {

	public static void main(String[] args) {

		List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book",
				"Pencil");
		Map<String, Long> collect = listOfStrings.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);

		Entry<String, Long> entry = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println(entry);

		Set<Entry<String, Long>> entrySet = collect.entrySet();
		Long value = 0l;
		String res = "";
		for (Entry<String, Long> e : entrySet) {
			Long val = e.getValue();
			if (value < val) {
				value = val;
				res = e.getKey()+" "+val;
			}
		}
		System.out.println("max"+value);
		System.out.println(res);

	}

}
