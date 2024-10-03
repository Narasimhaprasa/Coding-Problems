package in.ashokit.logical;

import java.util.Scanner;

/*Sweet Seventeen

Given a maximum of four digit to the base 17(10=>A,11=>B,12=>C,13=>D,14=>E,15=>F,16=>G) as input, output its decimal value.

input -------> a string value
con----------> no
output ------> an integer value 

base 10 ----> 0,1,2,3,4,5,6,7,8,9
base 8 -----> 0,1,2,3,4,5,6,7
base 16 ----> 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f
base 2 -----> 0,1
base 17 ----> 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,g

base16 ---> base10
hexa -----> decimal
base17 ---> base10
sweet seventeen -----> decimal

Ex:

	hexa to dec
	12 ---> 2x16^0 + 1x16^1 = 2+16=18
	sweet seventeen
	12 ---> 2x17^0 + 1x17^1 = 2+17=19
	1d ---> dx17^0 + 1x17^1 = d+17=13+17=30*/

public class LBP173 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a hexa decima Number :::");
		String hexaDecimal = sc.nextLine();
		//checkHexaDecimal(hexaDecimal);
		System.out.println(Integer.valueOf(hexaDecimal, 17));
	}

	public static void checkHexaDecimal(String hexaDecimal) {

		char[] chr = hexaDecimal.toCharArray();
		int i, len = chr.length, t = 0, d = 0;
		for (i = 0; i < len; i++) {
			if (chr[i] >= '0' && chr[i] <= '9')
				t = chr[i] - 48;
			else if (chr[i] >= 'a' && chr[i] <= 'g')
				t = chr[i] - 97 + 10;
			else if (chr[i] >= 'A' && chr[i] <= 'Z')
				t = chr[i] - 65 + 10;
			else
				d = (int) (d + t * Math.pow(17, len--));
		}
		System.out.println(d);
	}

}
