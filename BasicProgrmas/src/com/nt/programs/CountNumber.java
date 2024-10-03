package com.nt.programs;

public class CountNumber {

	public static void main(String[] args) {

		int num = 1234, rem=0, sum = 0;
		while (num != 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println(sum);

	}

}
