package in.ashokit.logical;
/*Sum of digits between two numbers

Create a function that sums the total number of digits between two numbers inclusive. 
for example, if the numbers are 19 and 22, then (1+9)+(2+0)+(2+1)+(2+2)=19.

input ----------> a number from the user
constraints ----> no
output ---------> sum of digits


Ex:
    n1 = 19
    n2 = 22
    sum = (1+9) + (2+0) + (2+1) + (2+2) = 10 + 2 + 3 + 4 = 19*/

import java.util.Scanner;

public class LBP050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a n1 number ::");
		int n1 = sc.nextInt();
		System.out.println("Enter a n2 number ::");
		int n2 = sc.nextInt();
		int s = 0;

		for (int i = n1; i <= n2; i++) {

			s = s + calSum(i);
		}
		System.out.println("Total sum of between two numbers::" + s);
	}

	public static int calSum(int n) {
		int remainder, sum = 0;
		while (n != 0) {
			remainder = n % 10;
			sum = sum + remainder;
			n = n / 10;
		}
		return sum;
	}

}
