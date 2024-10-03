package com.nt.programs;

public class RemoveVowel {

	public static void main(String[] args) {
		String str = "welcome";
		char[] charArray = str.toCharArray();

		int count = 0;
		/*for (int i = 0; i < str.length(); i++) {
			if (charArray[i] == 'a' || charArray[i] == 'e'|| charArray[i] == 'i' || charArray[i] == 'o'
					|| charArray[i] == 'u') {
				count++;
			}
		}
		System.out.println(count);*/
		String result = "";
		for (int i = 0; i < str.length(); i++) {

			if (charArray[i] != 'a' && charArray[i] != 'e' && charArray[i] != 'i' && charArray[i] != 'o'
					&& charArray[i] != 'u') {
				result = result + charArray[i];

			}

		}
		System.out.println(result);

	}
}
