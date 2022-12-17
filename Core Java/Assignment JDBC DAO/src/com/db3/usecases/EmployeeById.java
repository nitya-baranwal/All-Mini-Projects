package com.db3.usecases;

import java.sql.SQLException;
import java.util.Scanner;

import com.db3.dao.EmployeeDAO;
import com.db3.dao.EmployeeDAOImpl;
import com.db3.model.Employee;

public class EmployeeById {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp id:");
		int id = sc.nextInt();
		
		sc.close();
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		Employee emp = dao.getEmployeeById(id);
		
		System.out.println(emp);
	}
}
