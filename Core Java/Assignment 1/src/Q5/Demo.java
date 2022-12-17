package Q5;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = sc.nextInt();
        Student[] studentArray = new Student[n];
        for(int i=0; i<n; i++) {
            Student s = new Student();
            System.out.println("Enter name of student " + (i+1));
            String name = sc.next();
            s.setName(name);
            System.out.println("Enter roll number of student");
            int roll = sc.nextInt();
            s.setRoll(roll);
            System.out.println("Enter marks of student");
            int marks = sc.nextInt();
            s.setMarks(marks);
            studentArray[i] = s;
        }
        for(int i = 0; i<n; i++) {
            System.out.println("Student " + (i+1) + " details:");
            System.out.println("Name: " + studentArray[i].getName());
            System.out.println("Roll no: " + studentArray[i].getRoll());
            System.out.println("Marks: " + studentArray[i].getMarks());
        }
        int average = findAverage(studentArray);
        System.out.println("The average marks are "+ average);
    }
    public static int findAverage(Student[] studentArray){
        int sum = 0;
        for(int i=0; i< studentArray.length; i++){
            sum+=studentArray[i].getMarks();
        }
        return sum/studentArray.length;
    }
}


//        Create a Demo class and perform the following operation in the main method:
//        Take the number as input from the user, How many Student objects need to be
//        created.
//        Create an array of Students with those numbers.
//        Initialize all the student objects by taking details from the user.
//        print all the Student details.
//        print the average of all the Student marks.