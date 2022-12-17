package com.streamApi.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		
		List<Student> sList = new ArrayList<>();
		
		sList.add(new Student(11,"Nitya11",500));
		sList.add(new Student(14,"Nitya14",350));
		sList.add(new Student(18,"Nitya18",580));
		sList.add(new Student(15,"Nitya15",590));
		sList.add(new Student(19,"Nitya19",450));
		
		Optional<Student> maxS = sList
					.stream()
					.max((a,b) -> a.getMarks() > b.getMarks() ? 1 : -1);
		
		Student topper = maxS.get();
		System.out.println(topper);
	}
}
