package in.ashokit.logical;

import java.util.Scanner;

/*Next Letter

Implement the following function

def NextLetter(ch1,ch2);

The function accepts two characters ch1 and ch2 as arguments, ch1 and ch2 are alphabetical letters. Implement the function to find and return 
the next letter so that distance between ch2 and the next letter is the same as the distance between ch1 and ch2. 
While counting distance if you exceed thhe letter 'z' then, count the remaining distance starting from the letter 'a'.

Distance between two letters is the number of letters between them.

input ------> char ch1 and char ch2
con --------> no
output -----> char ch*/
public class LBP273 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ch1 value ::");
		char ch1 = sc.next().charAt(0);
		System.out.println("Enter ch2 value :");
		char ch2 = sc.next().charAt(0);
		int d = ch2 - ch1;
		if (ch2 == 'z')
			System.out.println((char) ('a' + d));
		else
			System.out.println((char) (ch2 + d));

	}

}
