package in.ashokit.logical;

import java.util.Scanner;

/*flight

amir is travelling to mumbai, but this time he is taking flight. His brother has already told him about luggage weight limits but forgot it. 
Now he is taking with him 3 trolly bags.

As per the current airlines which amir will fly. has below weight limits.

There can be at max 2 check-in and 1 cabin luggage. Check-in has total limit of L1 and Cabin has limit of L2.

Now, amir has 3 luggage has weights as W1 and W2 and W3 respectively. Now he should be smart enough to make sure that he can travel with all the 
3 luggage without paying extra charge.

Find out whether amir can take all of his luggage without any extra charges or not. If all good and no extra changes were paid, output "Yes" otherwise "No".

input ------> integers W1,W2,W3 and L1,L2
con --------> no
output -----> Yes or No

W1+W2+W3<=L1+L2 ---> Yes or No*/
public class LBP178 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a weight1 ::");
		int w1 = sc.nextInt();
		System.out.println("Enter a weight2::");
		int w2 = sc.nextInt();
		System.out.println("Enter a weight3::");
		int w3 = sc.nextInt();
		System.out.println("Enter a luggage1::");
		int l1 = sc.nextInt();
		System.out.println("Enter a luggage2 ::");
		int l2 = sc.nextInt();
		if (w1 + w2 + w3 <= l1 + l2)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
