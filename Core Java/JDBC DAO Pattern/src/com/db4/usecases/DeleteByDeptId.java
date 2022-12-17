package com.db4.usecases;

import java.util.Scanner;

import com.db4.dao.DepartmentDAO;
import com.db4.dao.DepartmentDAOImpl;

public class DeleteByDeptId {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dept id to be deleted");
		int did = sc.nextInt();
		sc.close();
		
		DepartmentDAO dao = new DepartmentDAOImpl();
		
		String mString = dao.deleteDeptBydeptid(did);
		System.out.println(mString);	
	}

}