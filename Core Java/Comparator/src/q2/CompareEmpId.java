package q2;

import java.util.Comparator;

public class CompareEmpId implements Comparator<Employee>{

	@Override
	public int compare(Employee s1, Employee s2) {
		if(s1.getEmpId() > s2.getEmpId()) {
			return +1;
		} else if(s1.getEmpId() < s2.getEmpId()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	
}
