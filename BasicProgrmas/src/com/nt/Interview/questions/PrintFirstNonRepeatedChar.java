package com.nt.Interview.questions;

public class PrintFirstNonRepeatedChar {

	public static void main(String[] args) {
		String input = "hello";
		char[] chr = input.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			boolean flag = true;
			for (int j = 0; j < chr.length; j++) {
                     if(i!=j && chr[i] == chr[j]) {
                    	 flag = false;
                    	 break;
                     }
			}
			if(flag) {
				System.out.print(chr[i]);
				break;
			}
		}
	}

}
