package com.nt.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintEvenAndOdd {

	public static void main(String[] args) {
	 
		 List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		 List<Integer> evenNumbers = listOfIntegers.stream().filter(i->i%2==0).collect(Collectors.toList());
		 System.out.println(evenNumbers);
		 List<Integer> oddNumbers = listOfIntegers.stream().filter(i->i%2!=0).collect(Collectors.toList());
		 System.out.println(oddNumbers);
		 
		 //Approach-2
		 Set<Integer> listOfNums = new HashSet<Integer>();
		 Set<Integer> list = listOfIntegers.stream().filter(n->listOfNums.add(n)).collect(Collectors.toSet());
		System.out.println(list);
		
		//Approach-3
		Map<Boolean, List<Integer>> listOfOddNumbers = listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));
		Set<Entry<Boolean, List<Integer>>> entrySet = listOfOddNumbers.entrySet();
		for(Entry<Boolean, List<Integer>> entry : entrySet) {
			if(entry.getKey()) {
				System.out.println("Even numbers");
			}else {
				System.out.println("Odd Numbers");
			}
			 List<Integer> list2 = entry.getValue();
			 for(int i : list2) {
				 System.out.println(i);
			 }
		}
	}

}
