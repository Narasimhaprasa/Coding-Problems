package com.nt.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		miniMaxSum(al);
	}

	public static void miniMaxSum(List<Integer> arr) {
		int ar[] = new int[arr.size()], k = 0;
		for (int i = 0; i < arr.size(); i++) {
			ar[k++] = arr.get(i);
		}

		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < ar.length - 1; i++) {
			sum1 = sum1 + ar[i];
		}
		for (int j = 1; j < ar.length; j++) {
			sum2 = sum2 + ar[j];
		}
    System.out.println(sum1+" "+sum2);
	}

}
