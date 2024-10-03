package com.nt.programs;

public class GeneratePassword {

	public static void main(String[] args) {
		String numbers = "1234567890";
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String mix = numbers + alpha;
		StringBuffer sb = new StringBuffer(mix);
		for(int i=0;i<3;i++) {
			char charAt = mix.charAt(i);
			sb.append(charAt);
		}
		System.out.println(sb);

	}

}
