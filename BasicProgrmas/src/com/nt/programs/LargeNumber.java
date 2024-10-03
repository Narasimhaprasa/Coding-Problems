package com.nt.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LargeNumber {

	public static void main(String[] args) {
		 
	int a[] = new int[] {45,20,23,98,100};
	int length = a.length;
	int max = a[0];
	for(int i=0;i<length;i++) {
		if(max>a[i]) {
			max = a[i];
		}
	}
	System.out.println("Maximum element in the given array:::"+max);
	
	for(int i=0;i<length ;i++) {
		System.out.print(a[i]+" ");
	}
	
	System.out.println("====================");
	Arrays.sort(a);
	System.out.println("Maximum element in the given array::"+a[length-1]);
	
	System.out.println("========================");
	
  List<int[]> asList = Arrays.asList( a);
  Optional<int[]> findFirst = asList.stream().findFirst();
  System.out.println(findFirst.get());
	}
	 
}
