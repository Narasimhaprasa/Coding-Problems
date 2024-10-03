package in.ashokit.logical;

import java.util.Scanner;

/*Accept video length in minutes the format is mm:ss in String format, create a function that takes video length and return it in seconds.

input --------> video length in mm:ss
constraint----> no
output -------> length in seconds*/
public class LBP048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the video length ::");
		String s[] = sc.nextLine().split(":");

		System.out.println(Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]));

	}

}
