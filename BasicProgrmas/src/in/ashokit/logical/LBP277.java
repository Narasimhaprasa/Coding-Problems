package in.ashokit.logical;

import java.util.Scanner;

/*super market pricing

A super market maintains a pricing format for all its products. A value N is printed on each product. 
When the scanner reads the value N on the item, the product of all the digits in the value N is the price of the item. the task here is to
 design the software such that given the code of any item N the product (multiplication) of all the digits of value should be computed (price).

input ----> an integer value
con ------> no
output ---> price

123 ----> 1*2*3 = 6*/

public class LBP277 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a product or item number ::");
		int item = sc.nextInt();
		int priceOfProduct = calculatePrice(item);
		System.out.println(priceOfProduct);
	}

	public static int calculatePrice(int item) {
		int remainder, product = 1;
		while (item != 0) {
			remainder = item % 10;
			product = product * remainder;
			item = item / 10;
		}
		return product;
	}
}
