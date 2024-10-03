package com.nt.programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindEvenNumbers {

	public static void main(String[] args) {
		 // to create a List
		List<Integer> list = new ArrayList<Integer>();
		// to add the elements into the list
		list.add(10);
		list.add(22);
		list.add(30);
		list.add(43);
		list.add(50);
		
		// to retrive the elements 
		/*for(Integer i : list) {
			if(list.get(i)%2 == 0)
				System.out.println(list);
		}//for
		*/	
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1001, "prasad");
		map.put(1002, "akash");
		
		System.out.println(map);
		
	
		
		
		
	}

}
