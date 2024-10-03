package in.ashokit.logical;

import java.util.Scanner;

/*The function accepts two +ve integers n1 and n2 as its arguments. 
Implement the function on given two values to return an int value as follows

Return whichever value is nearest to 21 without going over. Return 0 if they go both go over.

input ------> two integer values n1 and n2
constraint -> n1>0 and n2>0
output -----> 0 or n1 or n2
*/
public class LBP039 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a n1 value :");
	 int n1 = sc.nextInt();
	 System.out.println("Enter a n2 value :");
	 int n2 = sc.nextInt();
	 
	 if(n1>21 && n2>21)
		 System.out.println(0);
	 else if(n1>21)
		 System.out.println(n2);
	 else if(n2>21)
		 System.out.println(n1);
	 else
		 System.out.println((n1>n1)?n1:n2);
	}

}
