package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.StudentException;
import com.masai.model.Student;

public class LoginStudentUseCase {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username :");
		String username= sc.next();

		System.out.println("Enter Password :");
		String password= sc.next();
		
		
		StudentDao dao = new StudentDaoImpl();
		
		try {
	 	Student student= dao.signInStudent(username, password);
		
	 	System.out.println("Welcome "+student.getName());
	 	
	 		
	 
	 	
	 	
	 	
		}catch (StudentException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		

	}

}
