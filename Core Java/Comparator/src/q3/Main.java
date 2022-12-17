package q3;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(11,"A", "UP", 90));
		list.add(new Student(12,"B", "KN", 80));
		list.add(new Student(13,"D", "UK", 50));
		list.add(new Student(14,"C", "TN", 50));
		list.add(new Student(11,"A", "UP", 90));
		
		Set<Student> uniqueSet = new LinkedHashSet<>(list);
		
//		TreeSet<Student> ts = new TreeSet<Student>(uniqueSet);
		
		
		list = new ArrayList<Student>(uniqueSet);
		Collections.sort(list);
		
		
		
		for(Student s: list) {
			System.out.println(s);
		}
		
	}
}
