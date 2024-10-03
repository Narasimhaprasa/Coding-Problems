package in.ashokit.logical;

import java.util.Scanner;

/*Count 5s And Win

Arun is obsessed with primes, especially five. He considers a number to be luckiest if it has the highest number of five in it. 
If two numbers have the same frequency of five, Arun considers the last occurence of them to be luckiest, and if there is no five in any number,
 the first given number is considered luckiest. Help him choose the luckiest number.

input -----------> array size and elements
con -------------> no
output ----------> return luckiest number

Ex:
	5
	125 535 555 105 111 ===> 555

	5
	125 525 565 709 585 ===> 585

	5
	123 467 897 12 34 =====> 123
*/
public class LBP162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a a[] size ::");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter a a[] values ::");
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		checkLuckiestNumber(a, n);
	}

	public static void checkLuckiestNumber(int a[], int size) {
		int i, x, c = 0, element = 0;
		for (i = 0; i < size; i++) {
			x = count(a[i]);
			if (x >= c) {
				c = x;
				element = a[i];
			}
		}
		if (c != 0)
			System.out.println(element);
		else
			System.out.println(a[0]);
	}

	public static int count(int num) {
		int remainder, count = 0;
		while (num != 0) {
			remainder = num % 10;
			if (remainder == 5)
				count++;
			num = num / 10;
		}
		return count;
	}

}
