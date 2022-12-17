package q1;
import java.util.function.*;

public class Main{
	
	public static void main(String[] args) {
		
		Predicate<Student> p = s -> s.getMarks()<500;
		System.out.println(p.test(new Student(1,"Nitya",600)));
		
		Consumer<Student> c = s -> {
			System.out.println("Student details:");
			System.out.println("Roll " + s.getRoll() +"\n" + "Name "
			+ s.getName() + "\n" + "Marks " + s.getMarks());
		};
		c.accept(new Student(2,"Nitya",300));
		
		Supplier<Student> sp = () -> new Student(2,"NityaB",400);
		System.out.println(sp.get());
		
		Function<String,Integer> f = s -> Integer.parseInt(s);
		System.out.println(f.apply("500"));
	}
}
