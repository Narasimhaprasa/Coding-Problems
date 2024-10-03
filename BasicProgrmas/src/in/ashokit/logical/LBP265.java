package in.ashokit.logical;

import java.util.Scanner;

/*mathematical tricks

Aryan is studying in the 5th standard. He is very interested in mathematical tricks and always wanted to play with numbers. 
Aryan would like to replace existing numbers with some other numbers. Today he decided to replace all digits of the number
 (which is greater than or equal to 2 digits) by its squares and print it in reverse order. Write a program to help him to replace numbers accordingly.

input -----> a number
con -------> no
output ----> replaced all digits by its squares and revered number

Ex:
    123 ----> 941
*/
public class LBP265 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to playing mathematical tricks::");
		int num = sc.nextInt();
		doMathmaticalTricks(num);
	}

	public static void doMathmaticalTricks(int num) {
		int d;
		while (num != 0) {
			d = num % 10;
			System.out.print(d * d);
			num = num / 10;
		}
	}
}
