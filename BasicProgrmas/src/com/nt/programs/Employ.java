package com.nt.programs;

public class Employ {

	private String empName;
	private int empAge;
	private float empSalary;

	public Employ(String name, int age, float salary) {
		this.empName = name;
		this.empAge = age;
		this.empSalary = salary;
	}

	 

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employ [empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary + "]";
	}
}
