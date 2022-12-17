package com.db3.dao;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db3.model.Employee;
import com.db3.utility.DBUtil;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public int getSalaryById(int eid) {
		
		int sal = 0;
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select salary from employee3 where eid = ?");
			
			ps.setInt(1, eid);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				sal = rs.getInt("salary");
			}
		} catch(SQLException e) {
			
			e.printStackTrace();
		}
		return sal;
		
	}

	@Override
	public List<Employee> getEmployeesList() throws SQLException{
		
		List<Employee> employees = new ArrayList<>();
		
		try(Connection conn= DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from employee3");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int eid = rs.getInt("eid");
				String n = rs.getString("name");
				String a = rs.getString("address");
				int s = rs.getInt("salary");
				Employee emp = new Employee(eid,n,a,s);
				
				employees.add(emp);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return employees;
	}

	@Override
	public String updateSalary(int bonus) {
		
		String message = "Bonus not given";
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("update employee3 set salary=salary+?");
			
			ps.setInt(1, bonus);
			
			int x = ps.executeUpdate();
			
				if(x>0) {
					message = "Bonus added successfully";
					System.out.println(x + " employees are given bonus");
				}
			
		}catch(SQLException e) {
			message = e.getMessage();
		}
		
		return message;
	}

	@Override
	public Employee getEmployeeById(int eid){
		
		Employee emp = null;
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from employee3 where eid=?");
			
			ps.setInt(1, eid);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int id = rs.getInt("eid");
				String n = rs.getString("name");
				int s = rs.getInt("salary");
				
				emp = new Employee(id,n,s);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return emp;
	}

	@Override
	public List<Employee> getEmployeesBySalary(int upperLimitSalary) {
		
		List<Employee> empList = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection() ) {
			
			PreparedStatement ps = conn.prepareStatement("select * from employee3 where salary < ?");
			
			ps.setInt(1, upperLimitSalary);
			
			ResultSet rSet = ps.executeQuery();
			
			while(rSet.next()) {
				
				int id = rSet.getInt("eid");
				String n = rSet.getString("name");
				String a = rSet.getString("address");
				int s = rSet.getInt("salary");
				
				Employee e = new Employee(id,n,a,s);
				empList.add(e);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return empList;
	}

	@Override
	public int insertEmployeeDetails(Employee emp) {
		
		int x = 0;
		
		int i= emp.getEid();
		String n = emp.getName();
		int s = emp.getSalary();
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into employee3 values(?,?,?,?)");
			
			ps.setInt(1, i);
			ps.setString(2, n);
			ps.setString(3, null);
			ps.setInt(4, s);
			
			x = ps.executeUpdate();
			
			if(x>0) System.out.println("Inserted successfully");
			else System.out.println("Not inserted");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return x;
	}
	
	
	
}
