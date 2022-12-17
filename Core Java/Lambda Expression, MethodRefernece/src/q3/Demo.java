package q3;
import java.util.*;

public class Demo {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Delhi","Varanasi","Prayagraj","Bangluru");
		
		PrintList pl = l -> {
			l.forEach(System.out::println);
		};
		
		pl.display(list);
	}
}
