package in.ashokit.logical;

import java.util.Scanner;

/*number of even and odd elements

Implement a program to find number of even and odd elements in the given array

input -------> size and array elements
con ---------> no
output ------> print number of even and odd elements line by line

Ex:
    5
    1 2 1 2 3

    output: 
            2
            3*/

public class LBP138 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :::");
		int size = sc.nextInt();

		int[] a = new int[size];
		System.out.println("Enter the values ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		calculateSum(a, size);
	}

	public static void calculateSum(int a[], int size) {
		int i, oddCnt = 0, evenCnt = 0;
		for (i = 0; i < size; i++) {
			if (a[i] % 2 == 0)
				evenCnt++;
			else
				oddCnt++;
		}
		System.out.println("Even Count in array ::" + evenCnt);
		System.out.println("Odd Count in array ::" + oddCnt);
	}
}
