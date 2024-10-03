package com.nt.programs;

import java.util.Arrays;
import java.util.List;

public class GetNamesBasedOnIntial {

	public static void main(String[] args) {
		List<String> namesList = Arrays.asList("Smith", "Santosh", "John", "Ramu", "Raki", "Nithin");
		namesList.stream().filter((name) -> name.startsWith("J")).forEach(System.out::println);
	}

}
