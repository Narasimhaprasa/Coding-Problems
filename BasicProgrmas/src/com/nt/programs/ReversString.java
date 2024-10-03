package com.nt.programs;

public class ReversString {

	public static void main(String[] args) {
		String message = "Welcome";
		char[] arr = message.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		StringBuffer sb = new StringBuffer(message);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
	}

}
