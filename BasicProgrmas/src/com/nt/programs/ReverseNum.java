package com.nt.programs;

public class ReverseNum {

	public static void main(String[] args) {
		int num = 1234, remainder, reverse = 0, count = 0, sum = 0;

		while (num != 0) {
			remainder = num % 10;
			count++;
			sum = sum + remainder;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println(reverse);
		System.out.println(count);
		System.out.println(sum);

	}

}
