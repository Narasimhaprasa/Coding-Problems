package in.ashokit.logical;

import java.util.Scanner;

/*savings

There are 3 friends named Ronaldo,Messi,Rooney who worked at a compnay. 
Given thier monthly salaries and monthly expendictures, 
returns the highest saving amoung them.

input ------> single line with 6 space seperated integers.
con --------> no
output -----> highest saving amoung the 3 of them

Ex:
	6 2 4 1 10 3
	6-2=4
	4-1=3
	10-3=7
	print 7 is the highest saving*/
public class LBP185 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1, a2, b1, b2, c1, c2, a, b, c;
		System.out.println("Enter a1 value ::");
		a1 = sc.nextInt();
		System.out.println("Enter a2 value ::");
		a2 = sc.nextInt();
		System.out.println("Enter b1 value ::");
		b1 = sc.nextInt();
		System.out.println("Enter b2 value ::");
		b2 = sc.nextInt();
		System.out.println("Enter c1 value ::");
		c1 = sc.nextInt();
		System.out.println("Enter a c2 value ::");
		c2 = sc.nextInt();

		a = a1 - a2;
		b = b1 - b2;
		c = c1 - c2;
		int res = findGreatestNumber(a, b, c);
		System.out.println(res);

	}

	public static int findGreatestNumber(int a, int b, int c) {
		/*if (a > b && a > c)
			return Math.abs(a);
		else if (b > a && b > c)
			return Math.abs(b);
		else
			return Math.abs(c);*/
		return (a>b && a>c)?a:(b>c)?b:c;
	}
}
