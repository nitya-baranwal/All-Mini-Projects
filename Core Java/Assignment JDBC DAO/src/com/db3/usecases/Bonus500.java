package com.db3.usecases;

import java.sql.SQLException;
import java.util.Scanner;

import com.db3.dao.EmployeeDAO;
import com.db3.dao.EmployeeDAOImpl;

public class Bonus500 {
	
	public static void main(String[] args) throws SQLException {
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter bonus amount:");
		int bonus = sc.nextInt();
		sc.close();
		
		String message = dao.updateSalary(bonus);
		
		System.out.println(message);
		
	}
}
