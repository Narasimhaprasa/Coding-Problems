package in.ashokit.logical;

import java.util.Scanner;

/*Change Every Letter to the Next Letter

Write a function that changes every letter to the next letter:

"a" becomes "b"
"b" becomes "c"
"d" becomes "e"
and so on ...

note: there is no z's in test cases, be happy.

input ------> a string from the user
cons -------> no
output -----> modified string

Ex:
	abc  ----->  bcd
	hello ---->  ifmmp*/

public class LBP082 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word ::");
		String word = sc.nextLine();
		String result = modifyStr(word);
		System.out.println(result);
	}

	public static String modifyStr(String word) {
		char[] chr = word.toCharArray();
		int i, len = chr.length;
		String res = "";
		for (i = 0; i < len; i++) {
			//res = res +(char) (chr[i]+1);
			//res = res +(char) (word.charAt(i)+1);
			if(chr[i]>='a' && chr[i]<='z' || chr[i]>='A' && chr[i]<='Z')
				res = res + (char)(chr[i]+1);
		}
		return res;
	}

}
