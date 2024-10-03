package in.ashokit.logical;

import java.util.Scanner;

/*Implement a program to find toggle case of the given string. 
(Hint: toggle case is nothing but converting lower case characters to upper case 
and upper case characters to lower case.)

input -------> a string from the user
constraint --> non-empty string
output ------> print string in toggle case*/
public class LBP037 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a toggle string::");
        String word = sc.nextLine();
        
		/* for(int i=0;i<word.length();i++) {
			if(word.charAt(i)>='a' && word.charAt(i)<='z')
		           System.out.print((char)(word.charAt(i)-32));
			if(word.charAt(i)>='A' && word.charAt(i)<='Z')
				System.out.print((char)(word.charAt(i)+32));
		}*/
        
        char[]  chr = word.toCharArray();
        for(int i=0;i<chr.length;i++) {
        	if(chr[i]>='a' && chr[i]<='z')
        		System.out.print((char)(chr[i]-32));
        	if(chr[i]>='A' && chr[i]<='Z')
        		System.out.print((char)(chr[i]+32));
        	
        }
	}

}
