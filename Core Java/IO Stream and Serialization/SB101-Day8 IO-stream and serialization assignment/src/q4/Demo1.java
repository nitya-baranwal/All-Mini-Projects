package q4;

import java.io.*;
import java.util.*;

public class Demo1 {
	
	public static void main(String[] args) throws IOException {
	
		List<Student> sList = new ArrayList<Student>();
		
		sList.add(new Student(11,"N1",500,(new Address("UP", "Varanasi", 221001))));
		sList.add(new Student(11,"N1",500,(new Address("UP", "Varanasi", 221001))));
		sList.add(new Student(11,"N1",500,(new Address("UP", "Varanasi", 221001))));
		sList.add(new Student(11,"N1",500,(new Address("UP", "Varanasi", 221001))));
		sList.add(new Student(11,"N1",500,(new Address("UP", "Varanasi", 221001))));
		sList.add(new Student(11,"N1",500,(new Address("UP", "Varanasi", 221001))));
		
		FileOutputStream fos=new FileOutputStream("studentdata.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(sList);

		oos.close();
		
		System.out.println("a1 object is serailized");
	}
	
}
