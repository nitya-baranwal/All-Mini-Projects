package com.db3.usecases;

import java.util.Scanner;

import com.db3.dao.EmployeeDAO;
import com.db3.dao.EmployeeDAOImpl;
import com.db3.model.Employee;

public class SalaryByEid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id:");
		int id = sc.nextInt();
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		int sal = dao.getSalaryById(id);
		
		if(sal != 0) {
			System.out.println(sal);
		} else {
			System.out.println("Employee does not exist with id: "+id);
		}
	}

}
