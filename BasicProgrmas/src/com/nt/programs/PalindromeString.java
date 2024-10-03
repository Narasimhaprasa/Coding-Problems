package com.nt.programs;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "121".toLowerCase();

		char[] charArray = str.toCharArray();
        String result = "";
		for (int i = charArray.length - 1; i >= 0; i--) {
               result =result + str.charAt(i);
		}
		if(str.equals(result)) {
			System.out.println("String is palindrome : "+result);
		}else {
			System.out.println("String is not palindrome");
		}

	}

}
