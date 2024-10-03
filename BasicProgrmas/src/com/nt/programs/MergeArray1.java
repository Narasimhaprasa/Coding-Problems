package com.nt.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MergeArray1 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 7 }, b[] = { 2, 4, 6, 8 };
		int n = a.length;
		int m = b.length;
		mergeArray(a, b, n, m);
	}

	public static void mergeArray(int a[], int b[], int n, int m) {
		//	Map<Integer, Boolean> mp = new TreeMap<Integer, Boolean>();
		Map<Integer, Boolean> mp = new HashMap<Integer, Boolean>();

		for (int i = 0; i < n; i++) {
			mp.put(a[i], true);
		}
		for (int j = 0; j < m; j++) {
			mp.put(b[j], true);
		}

		for (Map.Entry<Integer, Boolean> me : mp.entrySet()) {
			System.out.print(me.getKey() + " ");
		}
	}

}
