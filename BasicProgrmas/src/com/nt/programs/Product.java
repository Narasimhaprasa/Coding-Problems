package com.nt.programs;

public class Product {
	private Integer pid;
	private String pname;
	private String category;
	private Long pcost;

	public Product(Integer pid, String pname, String category, Long i) {

		this.pid = pid;
		this.pname = pname;
		this.category = category;
		this.pcost = i;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", category=" + category + ", pcost=" + pcost + "]";
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getPcost() {
		return pcost;
	}

	public void setPcost(Long pcost) {
		this.pcost = pcost;
	}

}
