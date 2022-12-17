package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.exceptions.CourseException;
import com.masai.model.StudentCourseDTO;
import com.masai.utility.DBUtil;

public class CourseDaoImpl implements CourseDao{

	@Override
	public List<StudentCourseDTO> getAllStudentsByCourseName(String cname) throws CourseException {
		
		List<StudentCourseDTO> dtos = new ArrayList<>();
		
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select s.roll,s.name,s.email,"
														+ "s.address, c.cname, c.duration from student s INNER JOIN "
														+ "course c INNER JOIN student_course sc ON s.roll = sc.roll AND "
														+ "c.cid = sc.cid AND c.cname = ?");
												
			
			ps.setString(1, cname);
			
			ResultSet rs=  ps.executeQuery();
			
			
			while(rs.next()) {
				
				
				StudentCourseDTO dto = new StudentCourseDTO();
				dto.setRoll(rs.getInt("roll"));
				dto.setSname(rs.getString("name"));
				dto.setAddress(rs.getString("address"));
				dto.setEmail(rs.getString("email"));
				dto.setCname(rs.getString("cname"));
				dto.setDuration(rs.getString("duration"));
				
				
				dtos.add(dto);
				
				
			}
			
			
			if(dtos.size() == 0)
				throw new CourseException("No Student enrolled in that course");
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			throw new CourseException(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		return dtos;
	}

}
