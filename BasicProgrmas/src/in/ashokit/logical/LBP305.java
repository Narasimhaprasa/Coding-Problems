package in.ashokit.logical;

import java.util.Scanner;

/*Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. 
Today he got one tricky question. The problem statement is "A positive integer has been given as an input. Convert decimal value to binary
 representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggle all 
bits.

input --------> an integer value
constraint ---> n>0
output -------> +ve decimal integer value
*/
public class LBP305 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num::");
		int n1 = sc.nextInt(), n2, i = 0;
		int b[] = new int[4];
		while (n1 != 0) {
			b[i++] = n1 % 2;
			n1 = n1 / 2;
		}
		for (i = 0; i < 4; i++) {
			if (b[i] == 1)
				b[i] = 0;
			else
				b[i] = 1;
		}

		n2 = b[0] * 1 + b[1] * 2 + b[2] * 4 + b[3] * 8;
		System.out.println(n2);
	}

}
