package com.nt.Interview.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String input = "welcome";

		char[] chr = input.toCharArray();

		for (int i = 0; i < chr.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < chr.length; j++) {
				if (chr[i] == chr[j]) {
					flag = true;
				}
			}
			if (flag == false)
				System.out.print(chr[i]);
		}

		//approach -2
		Set<Character> str = new HashSet<Character>();
		char[] chrs = input.toCharArray();
		for (Character ch : chrs) {
			str.add(ch);
		}
		System.out.println(str);

		//Approach-3
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] chr1 = input.toCharArray();
		for (Character ch : chr1) {
			if (map.containsKey(ch)) {
				Integer count = map.get(ch);
				map.put(ch, count + 1);
			} else
				map.put(ch, 1);
		}
		System.out.println(map);
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1)
				System.out.print(entry.getKey());
		}

		//Approach-4
		System.out.println("Approach -4");
		char[] chr4 = input.toCharArray();
		for (Character ch : chr4) {
			int indexOf = input.indexOf(ch, 1);
			if (indexOf == -1)
				System.out.print(ch);
		}
	}
}
