package in.ashokit.logical;

import java.util.Scanner;

/*
Speed Maths

Jack was in 9th standard. He appeared for a speed maths competivie exam. Jack is taking longer time to solve one of the problems. 
Count the number of 1's in the binary representation of an integer. Help him to solve the below problem and write a code for the same.

input ------> an integer value
con --------> no
output -----> an int value

Ex:
    5 ---> 0101 ---> 2*/

public class LBP261 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int num = sc.nextInt();
		int res = count(num);
		System.out.println("Count of 1's in binary number ::" + res);
	}

	public static int count(int n) {
		int remainder, count = 0;
		while (n != 0) {
			remainder = n % 2;
			if (remainder == 1)
				count++;
			n = n / 2;
		}
		return count;
	}
}
