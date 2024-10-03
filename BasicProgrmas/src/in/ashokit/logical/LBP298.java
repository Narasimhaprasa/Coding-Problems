package in.ashokit.logical;

import java.util.Scanner;

/*Implement a program to find absolute diff between sum of max digits 
and sum of min digits present in three integers n1,n2 and n3

input -----> n1,n2 and n3
con -------> no
output ----> int value

n1=133
n2=312
n3=111

(3+3+1)-(1+1+1)=7-3=4
*/
public class LBP298 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a n1 value ::");
		int n1 = sc.nextInt();
		System.out.println("Enter a n2 value ::");
		int n2 = sc.nextInt();
		System.out.println("Enter a n3 value ::");
		int n3 = sc.nextInt(), s1, s2;
		s1 = max(n1) + max(n2) + max(n3);
		s2 = min(n1) + min(n2) + min(n3);
		System.out.println(Math.abs(s1 - s2));

	}

	public static int max(int n) {
		int remainder, max = 0;
		while (n != 0) {
			remainder = n % 10;
			if (max < remainder)
				max = remainder;
			n = n / 10;
		}
		return max;
	}

	public static int min(int n) {
		int remainder, min = 999;
		while (n != 0) {
			remainder = n % 10;
			if (min > remainder)
				min = remainder;
			n = n / 10;
		}
		return min;
	}
}
