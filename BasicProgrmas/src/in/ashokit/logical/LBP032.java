package in.ashokit.logical;

import java.util.Scanner;

/*Program to count number of special characters and white spaces in a given string.

input --------> A string from the user
constraint ---> non-empty string
output -------> number of special characters*/
public class LBP032 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter  a string ::");
       String str = sc.nextLine().toLowerCase();
       int count=0,i;
       for(i=0;i<str.length();i++) {
    	   if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='0' && str.charAt(i)<='9')
    		   continue;
    	   else
    		   count++;
    	   
       }
       System.out.println("Special characters count ::"+count);
	}

}
