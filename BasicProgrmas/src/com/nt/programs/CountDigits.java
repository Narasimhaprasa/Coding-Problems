package com.nt.programs;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		//int num=0;
		 int count = 0;
		 if(num>0) {
			 while(num != 0) {
				 count++;
				 num = num/10;
			 }
			 System.out.println("count of digits::"+count);
		 }//if
		 
			 

	}

}
