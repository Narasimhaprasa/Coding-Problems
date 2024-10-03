package com.nt.programs;

public class ReverseString {

	public static void main(String[] args) {
		String str = "hello";
		//Approach-1
		char[] chrArr = str.toCharArray();
		for (int i = chrArr.length - 1; i >= 0; i--) {
			System.out.print(chrArr[i]);
		}
		System.out.println("");
		
		
		//Approach-2
		for (int i = chrArr.length - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
      System.out.println("");
      
      
      //Approach-3
      StringBuffer sb1 = new StringBuffer(str);
      System.out.print(sb1.reverse());
      
      System.out.println("");
      
      
      //Approach-4
      StringBuilder sb2 = new StringBuilder(str);
      System.out.print(sb2.reverse());
	}

}
