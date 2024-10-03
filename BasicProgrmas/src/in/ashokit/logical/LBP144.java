package in.ashokit.logical;

import java.util.Scanner;

/*Find the Average of the Letters

Create a function that returns the average of an array composed of letters. 
First, find the number of the letter in the alphabet in order to find the average of the array.

A = 1
B = 2
C = 3
D = 4
E = 5

average = total sum of all numbers / number of item in the set
Return the result rounded to two decimal points.

input -----> an array as string
con -------> no
output ----> Return the result rounded to two decimal points.


Ex:
    'abc'
    sum = 1 + 2 + 3 = 6
    avg = 6/3 = 2.00

    'abcd'
    sum = 1 + 2 + 3 + 4 = 10
    avg = 10/4 = 2.xx*/

public class LBP144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :::");
		String s = sc.nextLine();
		int sum = 0, i;
		for (i = 0; i < s.length(); i++)
			sum = sum + (s.charAt(i) - 96);
		System.out.printf("%.2f", sum / (double) s.length());

		/*double res = calulateAverage(word);
		System.out.println(res);*/
	}

	public static double calulateAverage(String word) {
		char[] chr = word.toCharArray();
		int i, len = chr.length, sum = 0;
		for (i = 0; i < len; i++) {
			sum = sum + (chr[i] - 96);
		}
		double avg = sum / (double) len;
		return avg;
	}
}
