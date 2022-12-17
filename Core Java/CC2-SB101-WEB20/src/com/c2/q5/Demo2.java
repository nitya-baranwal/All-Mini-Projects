package com.c2.q5;

import java.io.FileInputStream;
import java.io.*;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException{
		
		
		FileInputStream fis = new FileInputStream("studentdata.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<Student> list2 = (List<Student>) ois.readObject();
		
		for(Student s: list2) {
			System.out.println(s);
		}
		ois.close();
		
		System.out.println("Deserialized");
		
		
		list2.add(new Student(6,"Farhan",500,"a@gmail.com","6F5",new Address("UP","Varanasi","221303")));
		System.out.println("New student 'Farhan' added to the list");
		
		
		FileOutputStream fos = new FileOutputStream("studentdata.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(list2);
		System.out.println("Serialized again");
		
		oos.close();
		
		System.out.println("Serialization, deserialization and again serialization complete");
		
	}
}
