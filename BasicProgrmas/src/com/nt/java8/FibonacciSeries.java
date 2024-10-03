package com.nt.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 *  Fibonacci series
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		Stream.iterate(new int[] {0,1}, f-> new int[] {f[1],f[0]+f[1]})
		.limit(10)
		.map(f->f[0])
		.forEach(i->System.out.print(i+" "));
		
		System.out.println();
		Stream.iterate(new int[] {1,3}, f-> new int[] {f[1],f[1]+2})
		.limit(10)
		.map(f->f[0])
		.forEach(i->System.out.print(i+" "));
		
		List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
		String res = listOfStrings.stream().skip(listOfStrings.size()-1).findFirst().get();
		System.out.println(res);

	}

}
