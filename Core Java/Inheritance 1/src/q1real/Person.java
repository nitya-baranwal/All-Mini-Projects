package q1real;

public class Person {
    String name;
    String gender;
    Address address = new Address();
}

class Address{
    String city;
    String state;
    String pinCode;
}

class Instructor extends Person{
    int instructorId;
    int salary;
}

class Student extends Person{
    int studentId;
    String courseEnrolled;
    int courseFee;
}