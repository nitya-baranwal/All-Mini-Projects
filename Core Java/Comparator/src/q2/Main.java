package q2;

import java.util.TreeSet;
import java.util.*;

public class Main {
	
		public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		TreeSet<Employee> ts = new TreeSet<>();
		
		
		if(n==1) {
			CompareEmpId cmpEmpId = new CompareEmpId();
			ts = new TreeSet<>(cmpEmpId);
		}
		if(n==2) {
			CompareEmpAd cmpEmpAd = new CompareEmpAd();
			ts = new TreeSet<>(cmpEmpAd);
		}
		if(n==3) {
			CompareEmpSalary cmpEmpSal = new CompareEmpSalary();
			ts = new TreeSet<>(cmpEmpSal);
		}
		
		ts.add(new Employee(17,"N1","KN",45000));
		ts.add(new Employee(12,"N2","TN",45000));
		ts.add(new Employee(13,"N3","UP",45000));
		ts.add(new Employee(14,"N4","BH",45000));
		ts.add(new Employee(15,"N5","UK",45000));
		ts.add(new Employee(16,"N6","GJ",45000));
		
	
		System.out.println(ts.size());
		
		for(Employee emp: ts) {
			System.out.println(emp);
		}
		
		
	}
}
