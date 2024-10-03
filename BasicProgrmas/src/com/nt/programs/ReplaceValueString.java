package com.nt.programs;

public class ReplaceValueString {

	public static void main(String[] args) {

		String message = "Welcome to naresh IT";

		char[] charArray = message.toCharArray();

		int count = 0;

		String result = "";

		for (int i = 0; i < charArray.length; i++) {

			System.out.print("" + count);

			count++;
		}

	}

}
