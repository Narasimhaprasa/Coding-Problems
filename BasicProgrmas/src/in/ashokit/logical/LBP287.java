package in.ashokit.logical;

import java.util.Scanner;

/*Hot and Cold Numbers

Immplement a program, it reads integers from the input device(until it gets -ve number) and put them into array. 
We define a hot number as any number whose last digit is 2, and cold number as any number that is less than 50. 
You have to modify the program such that

if it is hot number replace by -1
if it is cold number replace by -5
if it is both hot and cold replace by -6
else keep old number

input -----> a sequence of int values
con -------> no
output ----> a sequence of int values

Ex:
    92, 61, 13, 42, -1 ====> -1, 61, -5, -6*/
public class LBP287 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number::");
		int n = sc.nextInt();
		while (n != -1) {
			if (n % 10 == 2 && n > 50)
				System.out.println("-1");
			else if (n % 10 != 2 && n < 50)
				System.out.println("-5");
			else if (n % 10 == 2 && n < 50)
				System.out.println("-6");
			else
				System.out.println(n + " ");
			System.out.println("Enter a number ::");
			n = sc.nextInt();
		}
	}

}
