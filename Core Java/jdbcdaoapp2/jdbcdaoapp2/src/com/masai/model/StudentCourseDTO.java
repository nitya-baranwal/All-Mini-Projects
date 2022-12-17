package com.masai.model;

public class StudentCourseDTO {
	
	private int roll;
	private String sname;
	private String email;
	private String address;
	
	private String cname;
	private String duration;
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "StudentCourseDTO [roll=" + roll + ", sname=" + sname + ", email=" + email + ", address=" + address
				+ ", cname=" + cname + ", duration=" + duration + "]";
	}
	
	

	
	
}
