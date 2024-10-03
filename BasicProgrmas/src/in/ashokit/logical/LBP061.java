package in.ashokit.logical;

import java.util.Scanner;

/*Determine the color of a chess board square

You are given coordinates, a string that represents the coordinates of a square of the chess board. bellow is the chess board for your reference.

Return True if the saquare is in white, and false if the square is in Black.

The coordinates will always represent a valid chess board square. The coordinates will always have the letter first, and the number second.

input ----------> a string
constraint -----> length of the string is 2, a<=c[0]<=h and 1<=c[1]<=8
output ---------> true or false*/

public class LBP061 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a color of a chess board square::");
		 String color = sc.nextLine();
		 
		 int x = color.charAt(0)-96;
		 int y = color.charAt(1);
		 System.out.println(!(x%2 == y%2));

	}

}
