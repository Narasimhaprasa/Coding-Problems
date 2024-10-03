package com.nt.programs;

public class Emp {
	
	private Integer empId;
	private String empName;
	private Long empSalary;
	
	public Emp(int empId,String empName,long empsalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empsalary;
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

	public Long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary( Long empSalary) {
		this.empSalary = empSalary;
	}

}
