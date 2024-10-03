package com.nt.java8;

import java.util.stream.IntStream;

/*
 * How do you find sum of first 10 natural numbers?
 */
public class PrintNaturalNumbers {

	public static void main(String[] args) {
		 int sum = IntStream.range(0, 11).sum();
		 System.out.println(sum);

	}

}
