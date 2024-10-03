package in.ashokit.logical;

import java.util.Scanner;

/*puzzle

Dennis was solving a puzle. the puzzle was to verify a number whose cube ends with the number itself. Help Dennis to find the solution
 of the puzzle and write the code accordingly.

input --------> integer value to verified
con ----------> no
output -------> boolean value True or False

Ex:
    5 ---> 125 ----> true
    2 ---> 8 ------> false
*/
public class LBP262 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a puzzle number ::");
		int num = sc.nextInt();
		System.out.println((num * num * num) % 10 == num);
	}
}
