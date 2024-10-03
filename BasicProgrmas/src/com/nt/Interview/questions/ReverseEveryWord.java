package com.nt.Interview.questions;

public class ReverseEveryWord {

	public static void main(String[] args) {
		String input = "welcome to india";
		String[] s = input.split(" ");
		String res = "";
		for (String str : s) {
			String output = "";
			for (int i = str.length() - 1; i >= 0; i--) {
               output =  output+str.charAt(i);
			}
			res = res + output+" ";
		}
System.out.println(res);
	}

}
