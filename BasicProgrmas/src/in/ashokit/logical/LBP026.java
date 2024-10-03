package in.ashokit.logical;

import java.util.Scanner;

public class LBP026 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a forenihet :: ");
		 int f = sc.nextInt();
		 int c = (f-32)*5/9;
		 System.out.println(c);

	}

}
