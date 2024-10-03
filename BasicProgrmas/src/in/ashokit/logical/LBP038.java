package in.ashokit.logical;

import java.util.Scanner;

/*A company launched a new text editor that allows users to enter English letters, numbers and white spaces only. 
 * If a user attempts to enter any other type of characters, it is counted as miss. 
 * Given a String text, write an algorithm to help the developer detect the number of misses by a given user in the given input.

input -------> a string from the user
constraint --> non-empty string
output ------> find number of misses.*/
public class LBP038 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a String ::");
		 String word = sc.nextLine();
		 char[]  chr = word.toCharArray();
		 int count = 0;
		 for(int i=0;i<chr.length;i++) {
			 if((chr[i]>='a' && chr[i]<='z') || (chr[i]>='A' && chr[i]<='Z') || (chr[i]>='0' && chr[i]<='9')|| (chr[i]==' '))
				 continue;
			 else
				 count++;
		 }
		 System.out.println("Missing characters :"+count);

	}

}
