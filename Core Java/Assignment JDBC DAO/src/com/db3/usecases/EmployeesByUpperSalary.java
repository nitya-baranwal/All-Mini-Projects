package com.db3.usecases;

import java.util.List;
import java.util.Scanner;

import com.db3.dao.EmployeeDAO;
import com.db3.dao.EmployeeDAOImpl;
import com.db3.model.Employee;

public class EmployeesByUpperSalary {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter upper salary limit");
		int s = scanner.nextInt();
		scanner.close();
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		List<Employee> eList = dao.getEmployeesBySalary(s);
		
		for(Employee e:eList)
			System.out.println(e);
		
	}
}
