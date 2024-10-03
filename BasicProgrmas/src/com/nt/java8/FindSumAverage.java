package com.nt.java8;

import java.util.Arrays;

/*
 * Given an integer array, find sum and average of all elements?
 */
public class FindSumAverage {

	public static void main(String[] args) {
		int[] a = new int[] { 45, 12, 56, 15, 24, 75, 31, 89 };
		int sum = Arrays.stream(a).sum();
		System.out.println(sum);
		
		double avg = Arrays.stream(a).average().getAsDouble();
		System.out.println(avg);

	}

}
