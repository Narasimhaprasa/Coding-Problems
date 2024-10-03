package com.nt.programs;

import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int a1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int a2[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int a3[][] = new int[3][3];
		int i, j, k;
		 
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				for (k = 0; k < 3; k++) {
					a3[i][j] = a3[i][j] + (a1[i][k] * a2[k][j]);
				}
			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(a3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
