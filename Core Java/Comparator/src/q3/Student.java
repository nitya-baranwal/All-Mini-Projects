package q3;

import java.util.Objects;

public class Student implements Comparable{
	private int roll;
	private String name;
	private String address;
	private int marks;
	
	
	
	public Student() {
		super();
	}


	public Student(int roll, String name, String address, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public int hashCode() {
		return Objects.hash(marks);
	}


	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
 		
		if(this.marks > s.marks) {
			return true;
		} else if(this.marks < s.marks) {
			return false;
		} else {
			return (this.name.equals(s.name));
		}
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}


	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		
		if(this.marks > s.marks) {
			return +1;
		} else if(this.marks < s.marks) {
			return -1;
		} else {
			return (this.name.compareTo(s.name));
		}
	}
	
	
}
