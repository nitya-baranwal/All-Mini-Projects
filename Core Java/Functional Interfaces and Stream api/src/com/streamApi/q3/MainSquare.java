package com.streamApi.q3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainSquare {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		List<Integer> squaredList = list
										.stream()
										.map(s -> s*s)
										.collect(Collectors.toList());
		
		System.out.println("Original list of Integers:");
		list.forEach(System.out::println);
		
		System.out.println("Squared List of Integers:");
		squaredList.forEach(System.out::println);
		
		
		
										
	}
}
