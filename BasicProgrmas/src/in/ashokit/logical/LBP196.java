package in.ashokit.logical;

import java.util.Scanner;

/*modular exponentiation

Given three numbers b,e, and m. 
fill in a function that takes these three positive integer values and outputs b^e mod m.

input ------> b,e and m values
con --------> no
output -----> b^e mod m

FORMULA: pow(b,e)%m*/
public class LBP196 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a b value :");
		int b = sc.nextInt();
		System.out.println("Enter a e value ::");
		int e = sc.nextInt();
		System.out.println("Enter a m value :");
		int m = sc.nextInt();
		System.out.println((int) (Math.pow(b, e) % m));

	}

}
