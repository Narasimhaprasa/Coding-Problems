package in.ashokit.logical;

import java.util.Date;
import java.util.Scanner;

/*Vaccination Drive List Preparator

Currently government is taking lot of measures to control the spread of Coronavirus. As we have caccine now, many campaigns are done to 
vaccination.

Health dept is identifying the people in each area and recommended/vaccination of them. They are planning three stages

stage1: above 60 years
stage2: between 18 and 60
stage3: below 18 years

Implement a program to read date of birth of the person and decide he belong to which stage.

input -----> date of birth 
con -------> no
output ----> 1 or 2 or 3*/

public class LBP294 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a DOB:");
		String[] dob = sc.nextLine().split("/");
		int y = Integer.parseInt(dob[2]);
		int age = 2022 - y;
		if (age > 60)
			System.out.println(1);
		else if (age >= 18 && age <= 60)
			System.out.println(2);
		else
			System.out.println(3);

	}

}
