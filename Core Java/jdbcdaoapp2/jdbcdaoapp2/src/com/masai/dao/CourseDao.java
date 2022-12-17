package com.masai.dao;

import java.util.List;

import com.masai.exceptions.CourseException;
import com.masai.model.Student;
import com.masai.model.StudentCourseDTO;

public interface CourseDao {
	
	public List<StudentCourseDTO> getAllStudentsByCourseName(String cname)throws CourseException;

}
