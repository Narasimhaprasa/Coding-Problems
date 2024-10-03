package in.ashokit.logical;

import java.util.Scanner;

/*A company wishes to transmit data to another server. The data consists of numbers only. 
 * To secure the data during transmission, they plan to reverse the data during transmission; 
 * they plan to reverse the data first. Write an algorithm to reverse the data first.

input -------> Data to be transmitted as an integer.
constraint---> n>0
output ------> reverse of the integer*/
public class LBP040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a data as Integer format::");
		int data = sc.nextInt(), remainder, reverse = 0;

		while (data != 0) {
			remainder = data % 10;
			reverse = reverse * 10 + remainder;
			data = data / 10;
		}
		System.out.println("The data is reversed::" + reverse);

	}

}
