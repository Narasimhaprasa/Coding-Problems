package com.nt.programs;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "java is a programming language";
		// easy very is java
		String[] st = str.split(" ");
		String res = "";
		 
			for (int i = st.length-1; i >= 0; i--) {
				res = res +  st[i] + " ";
			}
		
		System.out.println(res);
	}

}
