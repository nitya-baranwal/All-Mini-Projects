package com.db4.dao;

import java.sql.SQLException;
import java.util.List;

import com.db4.exceptions.EmployeeException;
import com.db4.model.Employee;

public interface EmployeeDAO {
	
	public String insertNewEmployee(Employee e) throws EmployeeException;
	
	public List<Employee> getAllEmployeesInDept(String dname);
}
