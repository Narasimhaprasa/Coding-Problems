package com.nt.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		list.add("laptop");
		list.add("samsung");
		list.add("iphone");
		list.add("realme");
		list.add("bottle");
		list.add("bags");
		System.out.println("Enter a product name:::");
		String productName = sc.next();
		boolean flag = false;
	  for(String pname : list) {
		  if(productName.equals(pname)) {
			 flag = true;
			 break;
		  }  
	  }
	  if(flag == true) {
		  System.out.println("Product is available");
	  }else {
		  System.out.println("Product is not available");
	  }
	  
	}
}
