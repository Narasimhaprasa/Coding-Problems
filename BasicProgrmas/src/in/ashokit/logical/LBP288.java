package in.ashokit.logical;

import java.util.Scanner;

public class LBP288 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character ::");
		String s = sc.next();
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				flag = true;
				break;
			}
		}
		System.out.println((flag == true) ? "true" : "false");
	}

}
