package in.ashokit.logical;
/*Removing Duplicate Characters from a string

Given a string S, the task is to remove all the duplicates in the given string. 

input --------> a string from the user
con ----------> remove all duplicates
output -------> a string without duplicates

Ex:
	welcome -----> welcom
	hello -------> helo
	prakash -----> praksh*/

import java.util.Scanner;

public class LBP078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word ::");
		String word = sc.nextLine();
		String result = removeDuplicatesChars(word);
		System.out.println(result);
		 
		/* for(int i=0;i<word.length();i++)
		    {
		        if(res.indexOf(s.charAt(i))==-1)
		            res=res+s.charAt(i);
		    }
		    System.out.println(res);*/
	}

	public static String removeDuplicatesChars(String word) {
		char[] chr = word.toCharArray();
		int i, j, k, len = chr.length;
		String res = "";
		for (i = 0; i < len; i++) {
			boolean falg = false;
			for (j = i + 1; j < len; j++) {
				if (chr[i] == chr[j]) {
					falg = true;
				}
			}
			if (!falg)
				res = res + chr[i];
		}
		return res;
	}
}
