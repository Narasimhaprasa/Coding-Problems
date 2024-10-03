package com.nt.programs;

import java.util.Arrays;

public class Stack {
	private int arr[] = new int[5];

	public void  insert(int a) {
		int i=0;
		 if(a!=0) {
			 arr[i] =a;
			 i++;
		 }
			 
	}
	
	/*public int[] retrive() {
		int[] arrValues = new int[];
		for(int i=0; arr.length ;i++) {
			arrValues[i] = arr[i];
		}
		return arrValues;
	}*/
	@Override
	public String toString() {
		return "Stack [arr=" + Arrays.toString(arr) + "]";
	}

	public static void main(String[] args) {

		Stack st = new Stack();
         
         st.insert(20);
         st.insert(30);
         st.insert(40);
         st.insert(50);
          
         System.out.println(st);
       
         
	}

}
