package com.nt.programs;

import java.util.Scanner;

public class XOR {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       String s1 = sc.nextLine();
	       String s2 = sc.nextLine();
	       String res = performXOROpertions(s1,s2);
	       System.out.println(res);
	    }
	    public static String performXOROpertions(String s1,String s2){
	            
	        int i,j,len1=s1.length(),len2=s2.length();
	        String res = "";
	        for(i=0;i<len1;i++){
	               res = res+ (s1.charAt(i) ^ s2.charAt(i));
	        }
	        return res;
	    }

}
