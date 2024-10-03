package in.ashokit.logical;

import java.util.Scanner;

/*Video share

Video share is an online video sharing platform. The company has decided to rate its users channels based on the sum total of the number of 
views received online and the subscribers. This sum total is referred to as user points. The rating will be given according to the below charts.

User points rating
30-50       Average
51-60       Good
61-80       Excellent
81-100      Outstanding

input ------> points value
con --------> points>=30 and points<=100
output -----> rating*/
public class LBP195 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a rating ::");
		int rating = sc.nextInt();
		if (rating >= 30 && rating <= 100) {
			if (rating >= 30 && rating <= 50)
				System.out.println("Average");
			else if (rating >= 51 && rating <= 60)
				System.out.println("Good");
			else if (rating >= 61 && rating <= 80)
				System.out.println("Excellent");
			else
				System.out.println("Outstanding");
		}
	}

}
