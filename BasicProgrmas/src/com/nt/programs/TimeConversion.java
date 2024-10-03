package com.nt.programs;

public class TimeConversion {

	public static void main(String[] args) {
		String str = "11:59:00PM";
		print24(str);
		String  s = "prasad";
		String s1 ="prasad";
				System.out.println(s==s1);
				System.out.println(s.equals(s1));
	}

	public static void print24(String str) {
		//get hours 
		int  ch = '0';
		int  ch1 = '2';
		int h1 = (int) str.charAt(1) - '0';
		int h2 = (int) str.charAt(0) - '0';
		int hh = (h2 * 10 + h1 % 10);

		// if time is AM
		if (str.charAt(8) == 'A') {
			if (hh == 12) {
				System.out.println("00");
				for (int i = 2; i <= 7; i++)
					System.out.print(str.charAt(i));
			} else {
				for (int i = 2; i <= 7; i++)
					System.out.print(str.charAt(i));
			}
		}
		//it time is PM
		else {
			if (hh == 12) {
				System.out.print("12");
				for (int i = 2; i <= 7; i++)
					System.out.print(str.charAt(i));
			} else {
				hh = hh + 12;
				System.out.print(hh);
				for (int i = 2; i <= 7; i++)
					System.out.print(str.charAt(i));
			}
		}
	}
}
