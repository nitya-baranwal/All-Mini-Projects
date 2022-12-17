package com.db4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db4.model.Department;
import com.db4.utility.DBUtil;

public class DepartmentDAOImpl implements DepartmentDAO{

	@Override
	public String deleteDeptBydeptid(int did) {
		
		String message = "Dept not deleted";
		
		try(Connection con = DBUtil.provideConnection()){
			
			
			try {
				
				PreparedStatement ps2 = con.prepareStatement("update employee set deptid=NULL where deptid=?");
				
				ps2.setInt(1, did);
				
				int x = ps2.executeUpdate();
				
					try {
						PreparedStatement ps = con.prepareStatement("delete from department where did=?");
						ps.setInt(1, did);
						int y = ps.executeUpdate();
						if (y > 0)
							message = y + " rows deleted from the department";
					} catch (SQLException e) {
						message = "No such dept exist";
						System.out.println(e.getMessage());
					}
				
				
			} catch (SQLException e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
			
			
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return message;
	}

	@Override
	public Department setDeptLocationFromEmpAddress(String address) {
		Department dept = new Department();
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from department d left outer join employee e on d.did=e.deptid where e.address=?");
			
			ps.setString(1,address);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int did = rs.getInt("did");
				String dname = rs.getString("dname");
				String location = rs.getString("location");
				
				dept = new Department(did,dname,location);
				
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dept;
	}

}
