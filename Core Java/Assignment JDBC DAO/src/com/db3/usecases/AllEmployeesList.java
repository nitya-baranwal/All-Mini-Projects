package com.db3.usecases;

import java.sql.SQLException;
import java.util.List;

import com.db3.dao.EmployeeDAO;
import com.db3.dao.EmployeeDAOImpl;
import com.db3.model.Employee;

public class AllEmployeesList {
	
	public static void main(String[] args) throws SQLException {
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		List<Employee> empList = dao.getEmployeesList();
		
		if(empList.size() != 0) {
			for(Employee e:empList) {
				System.out.println(e);
			}
		}else {
			System.out.println("No employee in the database");
		}
	}
}
