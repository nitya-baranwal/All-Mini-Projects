package com.db4.usecases;

import java.util.List;
import java.util.Scanner;

import com.db4.dao.EmployeeDAO;
import com.db4.dao.EmployeeDAOImpl;
import com.db4.model.Employee;

public class AllEmployeesInAccount {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter dept name");
		String dname = sc.next();
		sc.close();
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		List<Employee> employeesInAccountDept = dao.getAllEmployeesInDept(dname);
		
		for(Employee emp: employeesInAccountDept)
		System.out.println(emp);
	}
}
