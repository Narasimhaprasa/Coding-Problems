package in.ashokit.logical;

import java.util.Scanner;

/*GlobalAdd

The media compnay "GlobalAdd" has received a batch of advertisements from different product brands. The batch of advertisements is a 
numeric value where each digit represnets the number of advertisements the media company has received from different product brands. 
Since the company banners permit only even numbers of advertisements to be displayed, the media company needs to know the totoal 
number of advertisements it will be able to display from the given batch.

Write an algorithm to calculate the total number of advertisements that will be displayed from the batch.

input -----> an integer
con -------> no
output ----> count of advertisements

Ex:
    1234 ----> 2*/
public class LBP256 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The batch of advertiesements ::");
		int total = sc.nextInt();
		int totalBrands = countEvenDigits(total);
		System.out.println("Total brands to display ::" + totalBrands);
	}

	public static int countEvenDigits(int batch) {
		int remainder, count = 0;
		while (batch != 0) {
			remainder = batch % 10;
			if (remainder % 2 == 0)
				count++;
			batch = batch / 10;
		}
		return count;
	}
}
