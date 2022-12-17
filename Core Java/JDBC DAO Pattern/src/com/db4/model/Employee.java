package com.db4.model;

public class Employee {
	
	private int empid;
	private String ename;
	private String address;
	private String mobile;
	private int deptid;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public Employee(int empid, String ename, String address, String mobile, int deptid) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.address = address;
		this.mobile = mobile;
		this.deptid = deptid;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", address=" + address + ", mobile=" + mobile
				+ ", deptid=" + deptid + "]";
	}
	
}
