package in.ashokit.logical;

import java.util.Scanner;

public class LBP004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a salesCount ::");
		int sales = sc.nextInt();
		
		if (sales >= 30 && sales <= 100) {
			if (sales >= 30 && sales <= 50)
				System.out.println("D");
			else if (sales >= 51 && sales <= 60)
				System.out.println("C");
			else if (sales >= 61 && sales <= 80)
				System.out.println("B");
			else
				System.out.println("A");
		}else {
			System.out.println("sales count is less than 30 ");
		}

	}

}
