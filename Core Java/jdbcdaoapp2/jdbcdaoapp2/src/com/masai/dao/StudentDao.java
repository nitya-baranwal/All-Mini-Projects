package com.masai.dao;

import com.masai.exceptions.CourseException;
import com.masai.exceptions.StudentException;
import com.masai.model.Student;

public interface StudentDao {
	
	public String registerStudent(Student student)throws StudentException;
	
	public Student signInStudent(String username, String password)throws StudentException;

	public String enrollStudentInCourse(int roll,int cid)throws StudentException,CourseException;
	
	
	
	
}
