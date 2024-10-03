package com.nt.programs;

public class DrawingBook {

	public static void main(String[] args) {
		int n = 5;
		int p = 4;
		int res = pageCnt(n, p);
		System.out.println(res);
	}

	public static int pageCnt(int n, int p) {
		int i, j, fCnt = 0, bCnt = 0;
		for (i = 1; i <= n;i++) {
			if (i % 2 == 0)
				i=i+1;
			else
				fCnt++;

		}
		for (j = n; j >= p; j--) {
			j = j - 1;
			if (j != p)
				bCnt++;

		}
		return fCnt < bCnt ? fCnt : bCnt;
	}
}
