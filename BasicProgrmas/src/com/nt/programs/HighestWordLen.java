package com.nt.programs;

public class HighestWordLen {

	public static void main(String[] args) {
		String[] strArray = { "welocome", "india", "java", "springboot", "microservices","determination","indianpremierleague" };
		int len = 0;
		String res = "";
		for (String s : strArray) {
			int wordLen = s.length();
			if (len < wordLen) {
				len = wordLen;
				res = s;
			}
		}
		System.out.println("Highest word is ::"+res);
	}
}
