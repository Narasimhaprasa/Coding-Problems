package in.ashokit.logical;

import java.util.Scanner;

/*MathAtTip

The online math course provider 'MathAtTip' has designed a course for children called Learning Number Recognition and Coutning. 
The assessment part of the course has a question where the student is given a number and a digit.
 The student needs to find out the total count of the digits present in the number excluding the given digit.

input ------> two space seperated int values
con --------> no
output -----> count of total digits excluding k*/

public class LBP289 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int num = sc.nextInt();
		System.out.println("Enter a digit based on given number ::");
		int d = sc.nextInt();
		int remainder, count = 0;
		while (num != 0) {
			remainder = num % 10;
			if (remainder != d)
				count++;
			num = num / 10;
		}
		System.out.println("Count of digits ::" + count);
	}

}
