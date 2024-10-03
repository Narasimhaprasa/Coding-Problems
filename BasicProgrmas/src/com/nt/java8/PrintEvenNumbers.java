package com.nt.java8;

import java.util.stream.IntStream;

/*
 * Print first 10 even numbers
 */
public class PrintEvenNumbers {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);
	}
}
