package in.ashokit.logical;

import java.util.Scanner;

/*BeautifyMe

The cosmetic company "BeauityMe" wishes to know the alphabetic product code from the product barcode. 
The barcode of the product is a numeric value and the alphabeitc product is a string value tagged 'a-j'. The alphabetic range 'a-j' 
represents the numeric range '0-9'. To produce the alphabetic product code. each digit in the numeric barcode is replace by the corresponding matching letters.

Write an algorithm to display the alphabetic product code from the numeric barcodes.

input ------> string
con --------> no
output -----> int value

	0=>a, 1=>b, 2=>c, 3=>d, 4=>e, 5=>f, 6=>g, 7=>h, 8=>i, 9=>j
Ex:
	abc ----> 012
	abejfgh -> 0149567*/
public class LBP174 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ::");
		String str = sc.nextLine();
		findBarcode(str);
	}

	public static void findBarcode(String s) {
		char[] chr = s.toCharArray();
		int i, len = chr.length;
		for (i = 0; i < len; i++) {
			System.out.print(chr[i] - 97);
		}
	}

}
