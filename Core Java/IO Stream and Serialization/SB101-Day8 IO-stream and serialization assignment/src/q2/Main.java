package q2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bReader = new BufferedReader(new FileReader("abc.txt"));
		String bString = bReader.readLine();
		
		while(bString != null) {
			
			System.out.println(bString);
			bString = bReader.readLine();
		}
	}
}
