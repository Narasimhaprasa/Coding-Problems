package com.nt.java8;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Find sum of all digits of a number in Java 8?
 */
public class SumAlldigits {

	public static void main(String[] args) {
		
		Integer i = 12345;
		Integer collect = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(collect);

	}

}
