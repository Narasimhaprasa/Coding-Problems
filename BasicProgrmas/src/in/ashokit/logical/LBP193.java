package in.ashokit.logical;

import java.util.Scanner;

/*Grocery Shop

There was a grocery shop. Shopkeeper would like to keep trasactions as simple as he can. Hence, he used to take money as whole number. 
To optimize trasactions, he decided if someone buys groceries from his shop, he will round money to the nearest whole number having zeros 
as last digit. Write a program to help shopkeeper to make trasactions much simple.

input -----> a number
con -------> no
output ----> nearest int value which ending with 0


Ex:
	34 ---> 40
	2 ----> 10
	89 ---> 90
	91 ---> 100*/
public class LBP193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int num = sc.nextInt();
		while (true) {
			if (num % 10 == 0) {
				System.out.println(num);
				break;
			}
			num++;
		}
	}

}
