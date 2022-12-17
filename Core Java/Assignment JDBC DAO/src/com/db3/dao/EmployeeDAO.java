package com.db3.dao;

import java.sql.SQLException;
import java.util.List;

import com.db3.model.Employee;

public interface EmployeeDAO {
	
	public int getSalaryById(int eid);
	
	public List<Employee> getEmployeesList() throws SQLException;
	
	public String updateSalary(int bonus) throws SQLException;
	
	public int insertEmployeeDetails(Employee emp);
	
	public Employee getEmployeeById(int eid) throws SQLException;
	
	public List<Employee> getEmployeesBySalary(int upperLimitSalary);
}
