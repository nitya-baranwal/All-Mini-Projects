package q3;

import java.util.Comparator;

public class Cmp implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		
		if(o1.getMarks() > o2.getMarks()) {
			return +1;
		} else if(o1.getMarks() < o2.getMarks()) {
			return -1;
		} else {
			return (o1.getName().compareTo(o2.getName()));
		}
	}
	
	
}
