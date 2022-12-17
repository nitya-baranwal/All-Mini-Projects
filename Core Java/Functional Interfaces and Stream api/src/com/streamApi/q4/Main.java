package com.streamApi.q4;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		Set<Student> sSet = new HashSet<>();
		
		sSet.add(new Student(11,"Nitya11",450));
		sSet.add(new Student(10,"Nitya10",350));
		sSet.add(new Student(15,"Nitya15",650));
		sSet.add(new Student(12,"Nitya12",450));
		sSet.add(new Student(12,"Nitya12",450));
		sSet.add(new Student(18,"Nitya12",450));
		sSet.add(new Student(12,"Nitya11",250)); //duplicate roll student
		
		Set<Student> newSet = sSet
								.stream()
								.filter(s -> s.getMarks() < 500)
								.collect(Collectors.toSet());
		
		newSet.forEach(System.out::println);
		
	}
}
