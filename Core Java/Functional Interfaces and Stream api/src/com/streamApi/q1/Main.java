package com.streamApi.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		
		List<Product> pList = new ArrayList<>();
		
		pList.add(new Product(5,"iPhone14",130000,4));
		pList.add(new Product(1,"iPhoneX",100000,12));
		pList.add(new Product(2,"iPhone12",110000,2));
		pList.add(new Product(3,"iPhone13",130000,3));
		pList.add(new Product(4,"iPhone13pro",120000,18));
		
		List<Product> filteredList = pList
										.stream()
										.filter(s -> s.getQuantity() > 10)
										.collect(Collectors.toList());
		
		Collections.sort(filteredList, (a,b) -> a.getPrice() > b.getPrice() ? 1 : -1);
		
		System.out.println("Original List Products:");
		pList.forEach(System.out::println);
		
		System.out.println("Filtered list products:");
		filteredList.forEach(System.out::println);
	}
}
