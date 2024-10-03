package com.nt.programs;

public class ArraySum {

	public static void main(String[] args) {
		int a1[] = { 2, 4, 1, 1, 1, 8 };
		int b1[] = { 1, 1, 1, 1, 3, 1 };
		
		int i,j;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
			 System.out.print(a1[i]+b1[i]+"  ");
			}
			System.out.println();
		}
		 
	}

}
