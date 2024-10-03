package com.nt.programs;

public class Employee {
	private Integer empId;
	private String empName;
	private Long salary;
	private Integer age;

	public Employee(Integer empId, String empName, Long salary , Integer age) {

		this.empId = empId;
		this.empName = empName;
		this.salary =salary;
		this.age = age;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
