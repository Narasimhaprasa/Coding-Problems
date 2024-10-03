package com.nt.programs;

public class Student {
	private String studentName;
	private Integer studentMarks;

	public Student(String studentName, Integer studentMarks) {
	 
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(Integer studentMarks) {
		this.studentMarks = studentMarks;
	}
}
