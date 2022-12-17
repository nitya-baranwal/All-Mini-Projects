package q1;
import java.util.*;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Main {
	
	public static void main(String[] args) {
		
		
//		List<String> list1 = Arrays.asList("Delhi","Mumbai","Kolkata","Chennai");
		List<String> list = new ArrayList<>();
		
		list.add("Delhi");
		list.add("Mumbai");
		list.add("Kolkata");
		list.add("Chennai");
		
		Collections.sort(list);
		System.out.println(list);
		
//		Collections.sort(list1);
//		System.out.println(list1);
	}
	
}