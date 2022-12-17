package com.db4.usecases;

import java.util.Scanner;

import com.db4.dao.EmployeeDAO;
import com.db4.dao.EmployeeDAOImpl;
import com.db4.exceptions.EmployeeException;
import com.db4.model.Employee;

public class InsertNewEmployee {

	public static void main(String[] args) throws EmployeeException {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter emp id:");
		int id = sc.nextInt();
		
		System.out.println("Enter emp name:");
		String ename = sc.next();
		
		System.out.println("Enter emp address:");
		String address = sc.next();
		
		System.out.println("Enter emp mobile:");
		String mob = sc.next();
		
		System.out.println("Enter emp deptid:");
		int deptid = sc.nextInt();
		
		sc.close();
		
		Employee emp = new Employee(id,ename,address,mob,deptid);
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		try {
			String m = dao.insertNewEmployee(emp);
			System.out.println(m);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
