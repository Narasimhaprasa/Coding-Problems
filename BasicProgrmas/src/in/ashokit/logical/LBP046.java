package in.ashokit.logical;

import java.util.Scanner;

/*Magic Date

Program to read date, month and year from the user and check whether it is magic date or not.
Here are the rules for magic date.

1) mm*dd is a 1-digit number that matches the last digit in YYYY
2) mm*dd is a 2-digit number that matches the last two digits in YYYY
3) mm*dd is a 3-digit number that matches the last three digits in YYYY

input --------> three int values
constraint----> no
output -------> true or false

Ex:
    1-2-2001 -----> 1x2=2 ----> false
    1-2-2002 -----> 1x2=2 ----> true
    2-5-2010 -----> 2x5=10 ---> true*/
public class LBP046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter  the day ::");
		int day = sc.nextInt();
		System.out.println("Enter the month::");
		int month = sc.nextInt();
		System.out.println("Enter  the year ::");
		int year = sc.nextInt(), n;
		n = month * day;
		
		if (n == year % 10 || n == year % 100 || n == year % 1000)
			System.out.println("true");
		else
			System.out.println("false");
		*/
		
		System.out.println("Enter the date::");
		String s[] = sc.nextLine().split("-");
		int d = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		System.out.println(s[2].endsWith(Integer.toString(d*m)));
	}

}
