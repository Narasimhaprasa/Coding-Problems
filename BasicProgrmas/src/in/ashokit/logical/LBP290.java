package in.ashokit.logical;
/*TodaysApparel

The e-commerce company "TodaysApparel" has a list of sales values of N days. Some days the company made a profit,
 represented as a positive value. Other days the company incurred a loss, represented as a negative sales value. 
The company wishes to know the number of profitable days in the list.

Write an algorithm to help the company know the number of profitable days in the list.

input -------> array size and elements
con ---------> no
output ------> count number of +ve values*/

import java.util.Scanner;

public class LBP290 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size ::");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the values ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		int res = findPostiveSalesCount(a, size);
		System.out.println("Positive sales count ::" + res);
	}

	public static int findPostiveSalesCount(int a[], int size) {
		int i, count = 0;
		for (i = 0; i < size; i++) {
			if (a[i] > 0)
				count++;
		}
		return count;
	}
}
