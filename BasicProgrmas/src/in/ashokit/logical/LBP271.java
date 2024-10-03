package in.ashokit.logical;

import java.util.Scanner;

/*Single Binary Value

Geetha Singh is trying to create a system to convert binary number to its decimal eqivalent. Help her to automate the process.

input -----> a binary value
con--------> no
output ----> decimal value

Ex:
    1010 ---> 0x2^0 + 1x2^1 + 0x2^2 + 1x2^3 ---> 0 + 2 + 0 + 8 ---> 10*/
public class LBP271 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number ::");
		String binaryNum = sc.nextLine();
		System.out.println(Integer.parseInt(binaryNum, 2));
		//convertBinaryNumber(binaryNum);
	}

	public static void convertBinaryNumber(int n) {
		int d, decimal = 0, i = 0, temp = n;
		while (n != 0) {
			d = n % 10;
			decimal = (decimal + d * (int) Math.pow(2, i++));
			n = n / 10;
		}
		System.out.println("Binary number " + temp + " is converted to Decimal Number " + decimal);
	}

}
