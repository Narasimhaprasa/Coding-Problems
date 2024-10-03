package com.nt.programs;

public class RemoveDuplicaChar {

	public static void main(String[] args) {
		String str = "aaabbbccc";
		char[] charArray = str.toCharArray();
		String result = "";
		for (int i = 0; i < charArray.length; i++) {
			for (int j = 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					result = result + str.charAt(i);
					break;
				}
			}

		}
		System.out.println(result);
		System.out.println(str);
	}

}
