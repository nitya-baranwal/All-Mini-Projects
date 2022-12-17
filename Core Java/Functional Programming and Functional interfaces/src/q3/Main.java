package q3;

import java.util.*;
public class Main {
	
	public static Map<String, Student> sortMapUsingStudentName(Map<String, Student>originalMap){
		List<Map.Entry<String, Student>> myList=new ArrayList<>(originalMap.entrySet());
//		Collections.sort(myList,(i1,i2) -> i2.getValue().getName().compareTo(i1.getValue().getName()) );
		
		Collections.sort(myList,new SortedByName());
		
		HashMap<String, Student> newhm=new LinkedHashMap<>();
		for(Map.Entry<String, Student> a : myList) {
			newhm.put(a.getKey(), a.getValue());
		}
		
		return newhm;
	}
	
	public static void main(String[] args) {
		HashMap<String, Student> hm=new HashMap<>();
		hm.put("india", new Student(01, "abhinav", "abc@", 100));
		hm.put("shri_lanka", new Student(02, "katapaa", "affbc@", 90));
		hm.put("nepal", new Student(03, "chunnu", "adfsfbc@", 91));
		hm.put("us", new Student(04, "biden", "abcda@", 36));
		hm.put("england", new Student(05, "queenofengland", "adadbc@", 33));
		Map<String, Student> collect=sortMapUsingStudentName(hm);
		
		collect.forEach((key,value) ->{
			System.out.println(key+ " "+ value);
		});
		
		Map<String, Student> m=new TreeMap<>();
		m.put("india", new Student(01, "abhinav", "abc@", 100));
		m.put("shri_lanka", new Student(02, "katapaa", "affbc@", 90));
		m.put("nepal", new Student(03, "chunnu", "adfsfbc@", 91));
		m.put("us", new Student(04, "biden", "abcda@", 36));
		m.put("england", new Student(05, "queenofengland", "adadbc@", 33));
		
		System.out.println(m);
	}
}



//import java.util.*;
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		Map<String, Student> map = new HashMap<String, Student>();
//		
//		map.put("India", new Student(11, "Nitya", "na@gmail.com", 500));
//		map.put("US", new Student(12, "Sonam", "sn@gmail.com", 200));
//		map.put("UK", new Student(10, "Richa", "ra@gmail.com", 400));
//		map.put("SZ", new Student(14, "Riya", "r@gmail.com", 100));
//		map.put("Japan", new Student(13, "Dev", "dv@gmail.com", 800));
//		
//		List<Map.Entry<String, Student>> mList = new LinkedList<Map.Entry<String,Student>>(map.entrySet());
//		
//		Collections.sort(mList, (i1,i2) -> i2.getValue().getName().compareTo(i1.getValue().getName()));
//		
//		Map<String, Student> hMap = new LinkedHashMap<String, Student>();
//		
//		for(Map.Entry<String, Student> ele : mList) {
//			hMap.put(ele.getKey(), ele.getValue());
//		}
//		
//		
//		
//		
//	}
//
//}
