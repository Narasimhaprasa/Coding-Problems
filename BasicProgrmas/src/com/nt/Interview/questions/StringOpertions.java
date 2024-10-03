package com.nt.Interview.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringOpertions {

	public static void main(String[] args) {
		String s = "welcome";
		List<String> list = Arrays.asList("java", "python", "smith", "john", "angular");

		Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(collect);

	}

}
