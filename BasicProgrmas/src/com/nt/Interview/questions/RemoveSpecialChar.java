package com.nt.Interview.questions;

public class RemoveSpecialChar {
	public static void main(String[] args) {
		String str = "@java432@#plainJAVA123*";
		char[] chr = str.toCharArray();
		for (int i = 0; i < chr.length; i++) {
              if((chr[i]>='a' && chr[i]<='z' )|| (chr[i]>='A' && chr[i]<='Z') || (chr[i]>='0' & chr[i]<='9'))
            	  System.out.print(chr[i]);
		}
	}
}
