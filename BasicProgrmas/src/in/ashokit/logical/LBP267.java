package in.ashokit.logical;

import java.util.Scanner;

/*party quiz

While sitting in party, Tom came up with an idea of a quiz. and the quiz is, Tom will spell out a number, and a person has to tell a number 
which is next to it. But this number has to be perfect square.

input -----> a number from the user
con -------> no
output ----> the perfect square after N*/
public class LBP267 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int num = sc.nextInt();
		int i;
		for (i = 1;; i++) {
			if (i * i >= num) {
				System.out.println(i * i);
				break;
			}
		}
	}

}
