package com.nt.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmpAgeCal {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(101, "smith", 10000l, 20));
		empList.add(new Employee(102, "john", 20000l, 22));
		empList.add(new Employee(103, "raju", 30000l, 24));
		empList.add(new Employee(104, "rani", 10000l, 25));
		
		  Optional<Integer> empAge = empList.stream().max((i1,i2)->i1.getAge().compareTo(i2.getAge())).map((i1)->i1.getAge());
		 if(empAge.isPresent()) {
			 System.out.println("Maximum emp age :"+empAge);
		 }
	}
}
