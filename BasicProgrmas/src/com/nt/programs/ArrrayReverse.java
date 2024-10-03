package com.nt.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrrayReverse {

	/*	public static int[] readArray(int[] a, int size) {
			int[] b = new int[size];
			for (int i = 0; i < size; i++) {
				b[i] = a[i];
			}
			return b;
		}
	*/

	public static void readArray(int[] a, int size) {

		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static void main(String[] args) {

		int a[] = { 10, 30, 40, 50, 90, 10 };
		System.out.println("array Reverse");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

		//Approach 2
		//Arrays.sort(a);
		System.out.println();
		readArray(a, a.length);

		System.out.println();
		Arrays.sort(a);

		readArray(a, a.length);

		List<Integer> list = new ArrayList<Integer>();
		for (int read : a) {
			list.add(read);
		}

		list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

		Integer minimum = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Minimum Element is ::" + minimum);

		Integer maximum = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Maximum element is ::" + maximum);

		System.out.println("Unique Elements ::");
		list.stream().distinct().forEach(System.out::println);

		long count = list.stream().count();
		System.out.println("Count of list :::" + count);

		int hashCode = list.stream().hashCode();
		int hashCode2 = list.stream().hashCode();

		System.out.println(hashCode);
		System.out.println(hashCode2);

	}
}
