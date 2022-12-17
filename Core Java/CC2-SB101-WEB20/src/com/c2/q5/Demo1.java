package com.c2.q5;

import java.io.*;
import java.util.*;

public class Demo1 {
	
	public static void main(String[] args) throws IOException,FileNotFoundException,ClassCastException {
		
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1,"Aman",500,"a@gmail.com","1A5",new Address("UP","Varanasi","221303")));
		list.add(new Student(2,"Bhuvan",500,"a@gmail.com","2B5",new Address("UP","Varanasi","221303")));
		list.add(new Student(3,"Chandan",500,"a@gmail.com","3C5",new Address("UP","Varanasi","221303")));
		list.add(new Student(4,"Danish",500,"a@gmail.com","4D5",new Address("UP","Varanasi","221303")));
		list.add(new Student(5,"Eshan",500,"a@gmail.com","5E5",new Address("UP","Varanasi","221303")));
		
		
		FileOutputStream fos = new FileOutputStream("studentdata.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(list);
		
		oos.close();
		
		System.out.println("Serialized");
	}
}
