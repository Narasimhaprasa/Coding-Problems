package in.ashokit.logical;

import java.util.Scanner;

/*Number of Occurrences

Program to find number of occurences of the given digit in the number n.

input ------> two numbers n and d
constraints-> no constraints
output -----> number of occurrences
*/
public class LBP016 {

	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           System.out.println("Enter a number ");
           int num = sc.nextInt();
           System.out.println("Enter a digit based on given "+num+" Number::");
           int digit = sc.nextInt(),remainder,count=0;
           
           while(num!=0) {
        	   remainder = num%10;
        	   if(remainder == digit)
        		   count++;
        	   num = num/10;
           }
           System.out.println("Occurences of the given digit in the number ::"+count);
	}

}
