package in.ashokit.logical;

import java.util.Scanner;

public class LBP013 {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number ::");
       int num = sc.nextInt(),count =0;
       
       while(num!=0) {
    	   count++;
    	   num = num/10;
       }
       System.out.println(count);
	}
}
