package com.nt.programs;

import java.util.Scanner;

public class StringLowerToUpper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:: ");
		String str = sc.next();
		char[] chr = str.toCharArray();
		char[] ch = new char[chr.length];
		for (int i = 0; i < chr.length; i++) {
			if (chr[i] >= 65 && chr[i] <= 90) {
				ch[i] = (char) (chr[i] + 32);
			}
			if (chr[i] >= 97 && chr[i] <= 122) {
				ch[i] = (char) (chr[i] - 32);
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();

	}
}