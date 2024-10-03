package in.ashokit.logical;

import java.util.Scanner;

/*Jackson, a math student, is developing an application on prime numbers. For the given two integers on the display of the application, 
 * the user has to identify all the prime numbers within the given range (including the given values).
 *  Afterwards the application will sum all those prime numbers. Jackson has to write an algorithm to find the sum of all the prime numbers of the given range.
Write an algorithm to find the sum of all the prime numbers of the given range.

input --------> two space seperated integers
constraint ---> both integers > 0
output -------> sum of all prime numbers between given numbers*/
public class LBP042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number starting range::");
		int startRange = sc.nextInt();
		System.out.println("Enter a number end range::");
		int endRange = sc.nextInt();
		int i, sum = 0;
		
		for (i = startRange; i <= endRange; i++) {
           if(isPrime(i))
        	   System.out.println(i);
		}
		System.out.println("Sum of all primeNumbers in the given range ::"+sum);
	}
	public static boolean isPrime(int n) {
		int i,f=0;
		for(i=1;i<=n;i++) {
			if(n%i ==0)
				f++;
		}
		return f==2;
	}

}
