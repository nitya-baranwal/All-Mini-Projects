package q4;

import java.io.*;
import java.util.*;

public class Demo2 {
	
	public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentdata.txt"));
		
		Object object = ois.readObject();
		List<Student> sL = (List<Student>) object;
		
		sL.forEach(System.out::println);
		
	}

}
