package q1;

import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("abc.txt");
		
		f.createNewFile();
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee name:");
		
		String name = br.readLine();
		
		System.out.println("Enter employee address:");
		String address = br.readLine();
		
		PrintWriter pw = new PrintWriter(f);
		
		pw.println(name);
		pw.println(address);
		
		pw.close();
	}

}
