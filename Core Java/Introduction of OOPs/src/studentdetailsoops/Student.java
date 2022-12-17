package studentdetailsoops;

public class Student {

    int roll;
    String name;
    int marks;

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.roll = 123;
        s1.name = "Nitya";
        s1.marks = 99;

        s1.displayStudentDetails();

        Student s2 = new Student();
        s2.roll = 234;
        s2.name = "Lucky";
        s2.marks = 90;

        s2.displayStudentDetails();

    }

    void displayStudentDetails() {
        System.out.println("Roll is: " + roll);
        System.out.println("Name is: " + name);
        System.out.println("Marks is: " + marks);
    }
}
