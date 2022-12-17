package com.db4.dao;

import com.db4.model.Department;

public interface DepartmentDAO {
	
	public String deleteDeptBydeptid(int did);
	
	public Department setDeptLocationFromEmpAddress(String address);

}
