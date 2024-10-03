package com.nt.programs;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		int i, j, min = 0;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {

				a[i][j] = sc.nextInt();
			}
		}
		for (i = 0; i < 3; i++) {
			min = a[i][0];
			for (j = 0; j < 3; j++) {
				if (min > a[i][j])
					min = a[i][j];
			}
			System.out.println(min);
		}
	}
}