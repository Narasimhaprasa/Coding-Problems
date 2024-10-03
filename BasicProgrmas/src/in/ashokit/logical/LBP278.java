package in.ashokit.logical;

import java.util.Scanner;

/*Number Container

Given two positive numbers N and K. The task is to find the nunber N containers exactly K digit or not.
 If contains then print True<space>digit_count otherwise False<space>digit_count.

input ----> Value of N and K
con ------> con
output ---> True|False<space>Digit_Count

Ex:
    123,3 -----> True 3
    12, 3 -----> False 2*/
public class LBP278 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a N value ::");
		int n = sc.nextInt();
		System.out.println("Enter a K value ::");
		int k = sc.nextInt(), remainder;
		//findNumberContainer(n, k);
		int count = count(n);
		boolean flag = false;
		while (n != 0) {
			remainder = n % 10;
			if (remainder == k) {
				flag = true;
				break;
			}
			n = n / 10;
		}
		if (flag == true)
			System.out.println("True" + "," + count);
		else
			System.out.println("False" + "," + count);
	}

	/*public static void findNumberContainer(int n, int k) {
		int remainder, count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		if (count == k)
			System.out.println("True" + "," + count);
		else
			System.out.println("False" + "," + count);
	}*/
	public static int count(int n) {
		int remainder, count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		return count;
	}
}
