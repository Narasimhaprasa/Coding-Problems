package com.nt.programs;

public class PrintUniqueEle {

	public static void main(String[] args) {
		//	int[] ar = { 1, 2, 3, 4, 3, 2, 1,5,5,7,878,756,4564,4,34 ,45};
		int[] ar = { 4, 9, 95, 93, 57, 4, 57, 93, 9 };
		int n = ar.length;
		printUnique(ar, n);
	}

	public static void printUnique(int ar[], int size) {
		int i, j;
		boolean flag;
		int res = 0;
		for (i = 0; i < size; i++) {
			flag = true;
			for (j = 0; j < size; j++) {
				if (i != j && ar[i] == ar[j]) {
					flag = false;
				
				}
			}
			if (flag == true)
				res = ar[i];
		}
		System.out.println(res);
	}
}
