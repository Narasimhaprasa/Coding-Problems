package com.nt.Interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOccuranceOfChar {

	public static void main(String[] args) {
		String input = "hello";
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char[] chr = input.toCharArray();
		for (Character ch : chr) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				Integer value = map.get(ch);
				map.put(ch, value + 1);
			}
		}
		System.out.println(map);
		for (Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
