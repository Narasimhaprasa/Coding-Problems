package com.nt.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentResults {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student("smith", 50));
		studentList.add(new Student("john", 76));
		studentList.add(new Student("ram", 90));
		studentList.add(new Student("akash", 89));
		studentList.add(new Student("naresh", 78));
		studentList.add(new Student("lokesh", 67));
		studentList.add(new Student("ramesh", 45));
		studentList.add(new Student("arun", 56));
		studentList.add(new Student("karthik", 87));
		studentList.add(new Student("vicky", 92));

		/* List<Student> studentMarks = studentList.stream().sorted((i1,i2)->((i1.getStudentMarks()< i2.getStudentMarks()) ? -1 : (i1.getStudentMarks()> i2.getStudentMarks()) ? 1 : 0)).collect(Collectors.toList());
		for(Student s : studentMarks) {
			System.out.println(s.getStudentMarks());
		}*/

		List<Integer> collect = studentList.stream().sorted((i1, i2) -> -i1.getStudentMarks().compareTo(i2.getStudentMarks()))
				.map((i1) -> i1.getStudentMarks()).collect(Collectors.toList());
	
		for(Integer s :collect) {
			System.out.println(s);
		}
	}

}
