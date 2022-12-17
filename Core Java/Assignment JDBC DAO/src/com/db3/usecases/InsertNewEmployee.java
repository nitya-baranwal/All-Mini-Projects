package com.db3.usecases;

import java.util.Scanner;

import com.db3.dao.EmployeeDAO;
import com.db3.dao.EmployeeDAOImpl;
import com.db3.model.Employee;

public class InsertNewEmployee {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter emp id:");
		int id = sc.nextInt();
		
//		sc.nextLine();
		
		System.out.println("Enter emp name:");
		String n = sc.next();
		
		System.out.println("Enter emp salary:");
		int s = sc.nextInt();
		sc.close();
		
		Employee emp = new Employee(id,n,s);
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		int x = dao.insertEmployeeDetails(emp);
		
//		System.out.println();
		
		
	}
}
