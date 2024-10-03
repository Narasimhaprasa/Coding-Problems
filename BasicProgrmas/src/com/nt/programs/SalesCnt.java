package com.nt.programs;

import java.util.Arrays;

public class SalesCnt {

	public static void main(String[] args) {
		int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int size = ar.length;
		int res = matchPairCnt(size, ar);
		System.out.println(res);
	}

	public static int matchPairCnt(int len, int[] arr) {
		int i, j;
		int pairCnt = 0;
		Arrays.sort(arr);
		for (i = 0; i < len; i++) {
			for (j = i+1; j < len; j++) {
				if (i != j && arr[i] == arr[j]) {
					pairCnt++;
					i=i+1;
					break;
				}
				i=i+1;
			}
		}
		return pairCnt;
	}

}
