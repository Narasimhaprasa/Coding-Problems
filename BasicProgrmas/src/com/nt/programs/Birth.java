package com.nt.programs;

import java.util.ArrayList;
import java.util.List;

public class Birth {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(2);
		al.add(2);
		al.add(1);
		al.add(5);
		al.add(3);
		al.add(2);
		int d = 9;
		int m = 3;
		int res = birthday(al, d, m);
		System.out.println(res);

	}

	public static int birthday(List<Integer> s, int d, int m) {
		int numWays = 0, sum = 0;
		int r = s.size() - m;
		for (int i = 0; i <= (s.size() - m); i++) {

			for (int j = i; j < i + m; j++) {
				sum += s.get(j);
			}

			if (sum == d) {
				numWays++;
			}

			sum = 0;
		}

		return numWays;
	}
}
