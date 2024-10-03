package in.ashokit.logical;

import java.util.Scanner;

/*Perfect Number

Create a function that tests whether or not an integer is a perfect number. A perfect number is a number that can be written as sum of its factors.
 (equal to sum of its proper divisors) excluding the number itself.

input ------> a number from the user
constraint -> n>0
output -----> true or false*/

public class LBP045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a start number ::");
		int n1 = sc.nextInt();
		System.out.println("Enter a end number ::");
		int n2 = sc.nextInt();

		int i, sum = 0;
		for (i = n1; i <= n2; i++) {
            if(isPerfect(i))
            	System.out.println(i);
		}
		/*for (i = 1; i < num; i++) {
		   if(num%i ==0)
			   sum = sum + i;
		}
		if(sum == num)
			System.out.println("It is perfect number ::"+num);
		else
			System.out.println("It is not a perfect number::"+num);*/
	}

	public static boolean isPerfect(int n) {
		int i, sum = 0;
		for (i = 1; i < n; i++) {
			if (n % i == 0)
				sum = sum + i;
		}
		return n == sum;
	}
}