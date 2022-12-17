package com.db4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db4.exceptions.EmployeeException;
import com.db4.model.Employee;
import com.db4.utility.DBUtil;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public String insertNewEmployee(Employee e) throws EmployeeException{
		
		String message = "Not updated";
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?,?)");
			
			ps.setInt(1, e.getEmpid());
			ps.setString(2, e.getEname());
			ps.setString(3, e.getAddress());
			ps.setString(4, e.getMobile());
			ps.setInt(5, e.getDeptid());
			
			int x = ps.executeUpdate();
			
			if(x>0) message="Inserted new employee";
			
		} catch (SQLException e1) {
			throw new EmployeeException(e1.getMessage());
		}
		return message;
	}

	@Override
	public List<Employee> getAllEmployeesInDept(String dname) {
			
			List<Employee> empList = new ArrayList<>();
			;
			
			try(Connection conn = DBUtil.provideConnection()){
				
				PreparedStatement ps = conn.prepareStatement("select * from Employee e left outer join Department d on d.did=e.deptid where d.dname=?");

				ps.setString(1, dname);
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					
					int eid = rs.getInt("empid");
					String name = rs.getString("ename");
					String address = rs.getString("address");
					String mob = rs.getString("mobile");
					int deptid = rs.getInt("deptid");
					
					Employee employee = new Employee(eid, name, address, mob, deptid);
//					System.out.println(employee);
					empList.add(employee);
//					System.out.println("Impl");
				}
			
			} catch (SQLException e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
			return empList;
	}
	
	
}