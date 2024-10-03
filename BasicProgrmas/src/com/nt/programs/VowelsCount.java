package com.nt.programs;

public class VowelsCount {
	public static void main(String[] args) {
		String str = "welcome to Real world".toLowerCase();

		char[] charArray = str.toCharArray();
		int count = 0;
		String result = "";
		for (int i = 0; i < charArray.length; i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				result = result + str.charAt(i);
				count++;
			}
		}
		System.out.println(count);
		System.out.println(result);

	}
}
