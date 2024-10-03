package com.nt.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {
		int a[] = { 10, 20, 10, 40, 50, 40, 50, 60 };
		int dupEle[] = new int[3];
		int i, j, f = 0;
		// Approach-1
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					dupEle[f++] = a[j];
					break;
				}
			}
			if (i == j) {
				System.out.println(a[i]);
			}
		}
		for (int ele : dupEle) {
			System.out.print(ele + "  ");
		}

		System.out.println("========================================");
		// Approach-2
		Set<Integer> hs = new HashSet<Integer>();
		for (int ele : a) {
			hs.add(ele);
		}
		System.out.println(hs);

		//Approach -3
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (j = 0; j < a.length; j++) {
			hashMap.put(a[j], j);
		}
		System.out.println(hashMap.keySet());

	}

}
