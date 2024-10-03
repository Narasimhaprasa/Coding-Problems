package in.ashokit.logical;

import java.util.Scanner;

/*mathematics class

In a mathematics class, number system is being taught to students, before teaching them 10's and 100's place, they will be taught the number
 positions. The positions will be starting from sequence number 1 and the direction will be from left to right.

So if i want to find second position of a digit in the number 90876, it will be 0. if the kth digit exceeds the number position return -1.

write a program to find the kth digit in a given number.

input -----> integer value and kth digit
con -------> no
output ----> an integer number

Ex:
    4598, 1 ----> 4
    4598, 2 ----> 5
    4598, 3 ----> 9
    4598, 4 ----> 8
    4598, 5 ----> -1*/

public class LBP263 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String s = sc.nextLine();
		System.out.println("Enter a kth element ::");
		int d = sc.nextInt();
		if (d < s.length())
			System.out.println(s.charAt(d - 1));
		else
			System.out.println(-1);
	}
}
