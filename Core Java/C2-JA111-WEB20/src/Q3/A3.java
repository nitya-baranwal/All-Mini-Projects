package Q3;
//instance of one class has a reference to an instance of another class or another instance of the same class.
//In the example below, object 'student'(class A3) and object 'student.city'(class City) have Has-A relationship
public class A3 {

    String name;
    int marks;
    String grade;
    City city;

    public static void main(String[] args) {
        System.out.println("Inside main function of class A3");
        A3 student = new A3();
        student.name = "Nitya";
        student.marks = 85;
        student.grade = "A";

        student.city = new City(); // class A3 and class City have Has-A relationship
        student.city.cityName = "New Delhi";

        System.out.println(student.name);
        System.out.println(student.marks);
        System.out.println(student.grade);
        student.city.cityfunc();
        System.out.println(student.city.cityName);

    }
    public static class City{
        String cityName;
        boolean cityfunc() {
            System.out.println("Inside cityfunc() of city class");
            return true;
        }
    }

}
