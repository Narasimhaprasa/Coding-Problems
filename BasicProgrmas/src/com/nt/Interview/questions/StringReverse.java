package com.nt.Interview.questions;

public class StringReverse {

	public static void main(String[] args) {
        String input = "hello";
        StringBuilder sb = new StringBuilder();
         
         sb.append(input);
         System.out.println(sb);
         sb.reverse();
         System.out.println(sb);
         
         char[] chr = input.toCharArray();
         
         for(int i=chr.length-1;i>=0;i--) {
        	 System.out.print(chr[i]);
         }
         
         System.out.println();
         for(int i=input.length()-1;i>=0;i--) {
        	 System.out.print(input.charAt(i));
         }
	}
}
