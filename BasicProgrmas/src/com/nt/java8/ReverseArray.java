package com.nt.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * Reverse the integer array
 */
public class ReverseArray {

	public static void main(String[] args) {
		 
		int[] array = new int[] {5, 1, 7, 3, 9, 6};
		int[] res = IntStream.rangeClosed(1, array.length).map(i->array[array.length-i]).toArray();
		System.out.println(Arrays.toString(res));
	}

}
