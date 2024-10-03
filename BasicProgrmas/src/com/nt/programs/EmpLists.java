package com.nt.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EmpLists {

	public static void main(String[] args) {
	 List<Emp> empList = new ArrayList<Emp>();
	 
	 empList.add(new Emp(101, "Smith", 10000));
	 empList.add(new Emp(102, "John", 20000));
	 empList.add(new Emp(103, "Roman", 20999));
	 
		 Iterator<Emp> iterator = empList.iterator();
		 while(iterator.hasNext()) {
			 Emp emp = iterator.next();
			 System.out.println(emp.getEmpId()+"    "+emp.getEmpName()+"   "+emp.getEmpSalary());
		 }
		 
		 System.out.println("==============================================================================");
		 ListIterator<Emp> listIterator = empList.listIterator();
		 
		 while(listIterator.hasNext()) {
			 Emp emp = listIterator.next();
			 System.out.println(emp.getEmpId()+"    "+emp.getEmpName()+"   "+emp.getEmpSalary());
		 }
		 
		 System.out.println("==============================================================================");
		 
		 empList.stream().forEach((i1)->System.out.println(i1.getEmpName()+" "+i1.getEmpSalary()));
		 
		 empList.stream().filter((i1)->i1.getEmpName().startsWith("S")).forEach((i1)->System.out.println(i1.getEmpName()));
		 
		 Stream<Emp> sorted = empList.stream().sorted();
		 
	 
	}

}
