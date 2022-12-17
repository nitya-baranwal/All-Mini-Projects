package q3;

import java.util.*;

public class SortedByName implements Comparator<Map.Entry<String, Student>> {

	@Override
	public int compare(Map.Entry<String, Student> o1, Map.Entry<String, Student> o2) {
		return o2.getValue().getName().compareTo(o1.getValue().getName());
	}

	
}
