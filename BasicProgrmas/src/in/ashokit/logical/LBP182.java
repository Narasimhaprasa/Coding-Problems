package in.ashokit.logical;

import java.util.Scanner;

/*absolute difference between prime numbers

You are given an array of integers, N of size array length.
Find the absolute difference (i.e. diff>=0) between the largest and smallest prime numbers.

Note:
    1. if there are 1 or fewer prime numbers in array return 0.
    2. the array may contain +ve and -ve numbers, ignore -ve numbers.
    3. 1 and 0 are not prime.

input ------> array size and array elements
con --------> no
output -----> absolute diff*/
public class LBP182 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size ::");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the values::;");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		findDifferenceOFPrimeNumbers(a, size);
	}

	public static void findDifferenceOFPrimeNumbers(int a[], int size) {
		int i, j, len = a.length, min = 999, max = -1;
		for (i = 0; i < size; i++) {

			if (a[i] > 0 && isPrime(a[i])) {
				if (min > a[i])
					min = a[i];
				if (max < a[i])
					max = a[i];
			}
		}
		if (max != -1 && max != 99)
			System.out.println(max - min);
		else
			System.out.println("0");
	}

	public static boolean isPrime(int num) {
		int i, f = 0;
		for (i = 1; i <= num; i++) {
			if (num % i == 0)
				f++;
		}
		return f == 2;
	}
}
