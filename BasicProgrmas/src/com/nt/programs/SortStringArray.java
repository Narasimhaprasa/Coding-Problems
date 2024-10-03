package com.nt.programs;

import java.util.Arrays;

public class SortStringArray {

	public static void main(String[] args) {
		String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Nov", "Dec", "aug",
				"nov" };
		Arrays.sort(months);
		for (String s : months) {
			System.out.print(s + " ");
		}
		System.out.println("==============================");
		Arrays.sort(months, String.CASE_INSENSITIVE_ORDER);
		for (String list : months) {
			System.out.print(list + " ");
		}
	}

}
