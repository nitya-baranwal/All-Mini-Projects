package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.CourseDao;
import com.masai.dao.CourseDaoImpl;
import com.masai.exceptions.CourseException;
import com.masai.model.StudentCourseDTO;

public class GetStudentsInCourseUseCase {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Course Name to Get details of Students :");
		String cname= sc.next();

		
		CourseDao cdao= new CourseDaoImpl();
		
		try {
		List<StudentCourseDTO> dtos= cdao.getAllStudentsByCourseName(cname);
		
		dtos.forEach(dto -> System.out.println(dto));
		
		
		
		}catch(CourseException c) {
			System.out.println(c.getMessage());
		}
		

	}
	
	
	
	
		
	

}
