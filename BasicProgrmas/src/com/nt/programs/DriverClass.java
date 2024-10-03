package com.nt.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DriverClass {

	public static void main(String[] args) {
		List<Employ> list = new ArrayList<Employ>();
		Employ e1 = new Employ("Smith", 23, 3000f);
		Employ e2 = new Employ("John", 24, 4000f);
		Employ e3 = new Employ("watson", 27, 5000f);

		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println("Before ::");
		System.out.println(list);
		List<Employ> salaryList = list.stream().map(e -> {
			if (e.getEmpAge() > 25)
				e.setEmpSalary(e.getEmpSalary() + e.getEmpSalary() * 10 / 100);
			return e;
		}).collect(Collectors.toList());

		System.out.println("After ::");
		//salaryList.forEach(System.out::println);
		System.out.println(salaryList);

		for (Employ e : salaryList) {
			System.out.println(e);
		}
		salaryList.forEach(System.out::println);
		
		salaryList.forEach(sal->System.out.println(sal.getEmpSalary()));
		
		
	}

}
