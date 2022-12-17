package q1_toString;

public class Student {
    private int roll;
    private String name;
    private int marks;
    private char grade;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade=" + grade +
                '}';
    }

    public Student(){}
    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    public void displayDetails(){
        char g = this.calculateGrade();
        this.setGrade(g);
        System.out.println(this);
    }

    private char calculateGrade(){
        if(this.marks >= 500) {
            return 'A';
        } else if(this.marks >= 400) {
            return 'B';
        } else {
            return 'C';
        }
    }
}

//Q1) Create a Student bean class having the following properties
//        Instance variables:
//private roll: int
//private String name
//private int marks
//private char grade
//        Provide suitable constructors, and following methods:
//public displayDetails(): void
//private calculateGrade(): char
//
//        if marks ≥ 500 : Grade is A
//        if marks < 500 and ≥ 400 : Grade is B
//        if marks <400 : Grade is C
//
//        Override the toString() method to print all the details of Student class.
//        inside the displayDetails() method, create the Student class object by taking (roll, name,
//        marks ) from the user and call the calculateGrade() method to get the Grade of the
//        Student.
//
//        Create another class Demo in which create two Student objects, and invoke the
//        displayDetails(). It should also display the student grade.