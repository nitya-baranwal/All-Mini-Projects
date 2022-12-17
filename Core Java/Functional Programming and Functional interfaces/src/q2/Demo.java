package q2;

//import java.util.*;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;
public class Demo {
  public static void main(String[] args) {
  	
// predicate-----------type return bollean--------------------------------------------------------------------------------  	
//    eg1	
//		Predicate<Integer> p1=(Integer i)->{
//			return i>=0;
//		};
//		System.out.println(p1.test(10));  
		
		Predicate<Integer> p1= i->i>=0;
		System.out.println(p1.test(10));  
	  
//	    eg2
//		Predicate<Student> s1=(Student s)->{
//			return s.getMarks()> 700;
//		};
//		
//		boolean s= s1.test(new Student(01,"Nitya", 1000));
//		System.out.println(s); 
		
		Predicate<Student> p2= s->s.getMarks()> 700;
		System.out.println(p2.test(new Student(01,"Nitya", 1000))); 
		
//		consumer-------------type void ---------------------------------------------------------------------------
//		eg1
		Consumer <String> c1=s->System.out.println("welcome using LE "+ s);
		c1.accept("Nitya");
		
//		eg2
		Consumer<Student> c2=std->{
			System.out.println(std.getRoll());
			System.out.println(std.getName());
			System.out.println(std.getMarks());
		};
		c2.accept(new Student(001, "raju", 90));
		
//		Supplier-----------type  return String-------------------------------------------------------------------------
//	    eg1
		Supplier<String> s1=()-> "this mgs is from  supplier LE ";
		System.out.println(s1.get());
		
//		eg2
		Supplier<Student> s2=()-> new Student(003, "Lucky", 100);
		System.out.println(s2.get());
		
//		Function---------------type- Integer- return-String---------------------------------------------------------------------------
//    eg1
		Function<Integer, String> f1=s->s>500 ? "pass" : "fail";
		System.out.println(f1.apply(1000));
//		eg2
		Function<Student, String> f2=s->s.getMarks()>100 ? "pass" :"fail";
		System.out.println(f2.apply(new Student(01, "Nitya", 333)));
  }
}