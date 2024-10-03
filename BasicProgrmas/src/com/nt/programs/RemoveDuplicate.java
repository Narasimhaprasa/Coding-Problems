package com.nt.programs;

import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		HashSet<Character> hs = new HashSet<Character>();
		String str = "narasimhaprasad";
		for (char c : str.toCharArray()) {
			if (hs.contains(c)) {
				System.out.print(c + "  ");
			} else {
				hs.add(c);
			}
		}
		System.out.println(hs);
		
		/*char[] ch = str.toCharArray();
		String result = "";
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < i; j++) {
				if (ch[i] == ch[j]) {
					System.out.print(ch[i] + " ");
				}
			}
		}
		System.out.println(result);*/
	}

}
