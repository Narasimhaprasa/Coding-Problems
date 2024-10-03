package in.ashokit.logical;

import java.util.Scanner;

/*Get word count

Create a function/method that takes a string and return the word count. 
The string will be a sentence.

Input: A string 
Constraints: No 
Output: Word count 

Ex:
    "java is very easy" ----> 4
    "abc mno pqr" ----------> 3
    "prakash" --------------> 1*/
public class LBP054 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence ::");
		String sentence = sc.nextLine();
		String[] word = sentence.split(" ");
		System.out.println("Number of words is ::" + word.length);

		char[] chr = sentence.toCharArray();
		int wordCount = 1;
		for (int i = 0; i < chr.length-1; i++) {
			if (chr[i] == ' ')
				wordCount++;
		}
		System.out.println("Number of words is ::" + wordCount);
	}

}
