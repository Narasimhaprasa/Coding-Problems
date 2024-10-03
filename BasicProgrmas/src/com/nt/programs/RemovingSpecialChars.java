package com.nt.programs;

public class RemovingSpecialChars {
	public static void main(String[] args) {
		String str = "BBBAAACC124@#";

		char[] charArray = str.toCharArray();

		String result = "";
		for (int i = 0; i < charArray.length; i++) {

			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				result = result + str.charAt(i);
			} // if

		} //for
		System.out.println(result);
	}
}
