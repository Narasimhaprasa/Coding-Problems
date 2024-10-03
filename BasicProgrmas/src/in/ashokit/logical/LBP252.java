package in.ashokit.logical;

import java.util.Scanner;

/*Employee's Rating Point

In a company, an employee's rating point (ERP) is calculated as the sum of the rating points given by the employee's manager and HR. 
The employee rating grade (ERG) is calculated according to the ERP ranges given below.

ERP	    ERG
30-50	D
51-60	C
61-80	B
81-100	A

Write an algorithm to find the ERG character for a given employee's ERP.

input -------> an integer value 
con ---------> con
output ------> employee rating grade
*/
public class LBP252 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rating point ::");
		int ratingPoints = sc.nextInt();
		if (ratingPoints >= 30 && ratingPoints <= 50)
			System.out.println("D");
		else if (ratingPoints >= 51 && ratingPoints <= 60)
			System.out.println("C");
		else if (ratingPoints >= 61 && ratingPoints <= 80)
			System.out.println("B");
		else
			System.out.println("A");
	}

}
