package com.nt.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNum {

	public static void main(String[] args) {

		List<Integer> elements = Arrays.asList(1, 2, 7, 8, 3, 3, 5, 4, 5, 6, 33, 453);
		System.out.println("Printing even numbers ::");
		elements.stream().filter((n) -> n % 2 == 0).forEach(System.out::println);

		System.out.println("Printing Odd numbers ::");
		elements.stream().filter((n) -> n % 2 != 0).forEach(System.out::println);

		Optional<Integer> findFirst = elements.stream().findFirst();
		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
		System.out.println("FindAny method::");
		Optional<Integer> findAny = elements.stream().findAny();
		if (findAny.isPresent()) {
			System.out.println(findAny.get());
		}

		elements.stream().forEach(System.out::println);

		List<Integer> collect = elements.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);

		long ele = elements.stream().count();
		System.out.println("Count of the elements::" + ele);

		Integer max = elements.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("maximum element ::" + max);

		Integer min = elements.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("minimum element is : " + min);

		List<Integer> uniqueEle = elements.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique elements is ::" + uniqueEle);

		List<Integer> unordered = elements.stream().unordered().collect(Collectors.toList());
		System.out.println("Unordered List::" + unordered);

		// elements.stream().skip(1).forEach(System.out :: println);
		List<Integer> skipEle = elements.stream().skip(2).collect(Collectors.toList());
		System.out.println("Skip elements ::" + skipEle);

		List<String> names = Arrays.asList("karthik", "karan", "ramu", "rajesh", "kamal");
		List<String> namesList = names.stream().filter((n) -> n.startsWith("r")).collect(Collectors.toList());
		System.out.println("Starts with k ::" + namesList);

		List<String> oneEle = elements.stream().map((i1) -> i1 + "").filter((i1) -> i1.startsWith("3"))
				.collect(Collectors.toList());
		System.out.println("Start with 1 ::" + oneEle);

		boolean parallel = elements.stream().isParallel();
		System.out.println(parallel);

		Stream<Integer> sequential = elements.stream().sequential();
		System.out.println(sequential.isParallel());

		Stream<Integer> parallelStream = elements.parallelStream();
		System.out.println(parallelStream.isParallel());

		Integer next = elements.iterator().next();
		System.out.println(next);

		// elements.clear();

		boolean hasNext = elements.stream().iterator().hasNext();
		System.out.println(hasNext);

		int n = elements.size();
		System.out.println("size of elements :: " + n);

		boolean contains = elements.contains(1);
		System.out.println(contains);

		int indexOf = elements.indexOf(3);
		System.out.println(indexOf);

		Integer integer = elements.get(2);
		System.out.println(integer);

		boolean containsAll = elements.containsAll(oneEle);
		System.out.println(containsAll);
	}
}
