package in.ashokit.logical;

import java.util.Scanner;

/*power function

In a mathematics class, the students are beign taught power function. So "a" raised to the power of "b" is shown as a^b and the calculatation 
goes as a*a*a...b times. Now there is slight twist to the problem, the students have to find out the last digit of the resultant a^b. 

input -----> an integer value as base and power
con -------> no
output ----> last digit of a^b

Ex:
    12, 2 ---> 12^2 --> 144 ---> 4*/
public class LBP264 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a base value ::");
		int a = sc.nextInt();
		System.out.println("Enter a power value ::");
		int b = sc.nextInt();
		System.out.println((int) Math.pow(a, b) % 10);

	}

}
