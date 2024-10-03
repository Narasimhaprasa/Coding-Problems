package in.ashokit.logical;

import java.util.Scanner;

/*test paper set

In an online exam, the test paper set is categorized by the letters A-Z.
 The students enrolled in the exam have been assigned a numeric value called application ID. 
To assign the test set to the student, firstly the sum of all digits in the application ID is calculated.
 If the sum is within the numeric range 1-26 the corresponding alphanetic set code is assigned to the student, 
else the sum of the digits are calcualted again and so on unitil the sum falls within the 1-26 range.

input ------> application id as int
con --------> no
output -----> set number

Ex:
	123 ----> 1+2+3=6 ---> F
	123456789 ---> 1+2+3+4+5+6+7+8+9 = 50 = 5+0 = 5 ---> E
	123456 ---> 1+2+3+4+5+6 = 21 ---> U*/
public class LBP191 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a enrolled number ::");
		int enrollNum = sc.nextInt(), sum = 0;
		while (true) {
			if (enrollNum >= 1 && enrollNum <= 26) {
				System.out.print((char) (enrollNum + 64));
				break;
			}
			enrollNum = sum(enrollNum);
		}
	}

	public static int sum(int num) {
		int remainder, sum = 0;
		while (num != 0) {
			remainder = num % 10;
			sum = sum + remainder;
			num = num / 10;
		}
		return sum;
	}

}
