package com.nt.programs;

import java.util.HashMap;
import java.util.Map;

public class ArraySubset {

	public static void main(String[] args) {

		//	int A[] = { 55, 48, 79, 26, 102 };
		//	int B[] = { 48, 26 };
		int A[] = { 23, 31, 66, 47, 16 };
		int B[] = { 12, 23, 31 };
		int n = A.length;
		int m = B.length;

		if (checkSubset(A, B, n, m))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static boolean checkSubset(int A[], int B[], int n, int m) {

		int i, j, bCnt = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				if (A[i] == B[j])
					bCnt++;
			}
		}
		return (bCnt == m) ? true : false;
	}

}
