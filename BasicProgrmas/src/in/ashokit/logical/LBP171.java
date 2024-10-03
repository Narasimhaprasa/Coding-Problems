package in.ashokit.logical;

import java.util.Scanner;

/*Word Key

One programming language has the following keywords that cannot be used as identifiers. 
break,case,continue,default,defer,else,for,func,goto,if,map,range,return,struct,type,var

write a program to find if the given word is a keyword or not.

input ------> string from the user
con --------> con
output -----> true or false


Ex:
	case ----> true
	auto ----> false*/
public class LBP171 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ::");
		String word = sc.nextLine();
		boolean isTrue = checkIdentifier(word);
		System.out.println(isTrue);

	}

	public static boolean checkIdentifier(String word) {
		String[] s = { "break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map",
				"range", "return", "struct", "type", "var" };
		boolean falg = false;
		for (String str : s) {
			if (str.equals(word)) {
				falg = true;
				break;
			}
		}
		return falg;
	}
}
