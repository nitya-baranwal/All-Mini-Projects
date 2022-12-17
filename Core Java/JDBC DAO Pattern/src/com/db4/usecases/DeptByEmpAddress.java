package com.db4.usecases;

import java.util.Scanner;

import com.db4.dao.DepartmentDAO;
import com.db4.dao.DepartmentDAOImpl;
import com.db4.model.Department;


public class DeptByEmpAddress {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter emp address");
		String address = sc.next();
		
		DepartmentDAO dao = new DepartmentDAOImpl();
		
		Department d = dao.setDeptLocationFromEmpAddress(address);
		
		System.out.println(d);
	}
}
