package com.nt.programs;

import java.util.Set;
import java.util.TreeSet;

public class ArraySort {

	public static void main(String[] args) {

		int array1[] = { 10, 23, 10,67,200, 56, 46, 12 };
		int array2[] = { 20, 30, 20,5, 4, 8, 6,100,110 };
		int res1[] = new int[array1.length+ array2.length];

		int i, j, length = array1.length, temp;
		for (i = 0; i < length; i++) {
			for (j = i + 1; j < length; j++) {
				if (array1[i] > array1[j]) {
					temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}
		}

		for (i = 0; i < length; i++) {
			for (j = i + 1; j < length; j++) {
				if (array2[i] > array2[j]) {
					temp = array2[i];
					array2[i] = array2[j];
					array2[j] = temp;
				}
			}
		}
		System.out.println("Array1 elements after sorting::  ");
		for (int ele : array1) {
			System.out.print(ele + "   ");
		}
		System.out.println();
		System.out.println("Array2 elements after sorting :: ");
		for (int ele : array2) {
			System.out.print(ele + "   ");
		}
		int i1;
		for(i1=0;i1<length;i1++) {
			res1[i1] = array1[i1];
		}
		 
		for(int i2=0;i2<array2.length;i2++) {
			res1[i1] = array2[i2];
			i1++;
		}
		 System.out.println();
		 System.out.println("Merging two arrays in sorting order");
		 int temp1;
		 for(i=0;i<res1.length;i++) {
			 for(j=i+1;j<res1.length;j++) {
				 if(res1[i]>res1[j]) {
					 temp1=res1[i];
					 res1[i] = res1[j];
					 res1[j] = temp1;
				 }
			 }
		 }
		 for(int ele : res1) {
			 System.out.print(ele+"  ");
		 }
		 System.out.println();
		 System.out.println("max element in the given array:::"+res1[res1.length-1]);
		 System.out.println("min element in the given array::"+res1[res1.length - res1.length]);
		 
		 // remove duplicate elements in the result array
         Set<Integer> removeDup = new TreeSet<Integer>();
         System.out.println("Removing duplicates elements in the result array::");
         for(int eles : res1) {
        	 removeDup.add(eles);
         }
         
         System.out.println(removeDup);
	}
}
