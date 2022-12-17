package q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = sc.nextInt();
        Student[] studentArray = new Student[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter student "+ (i+1) + " name:");
            String name = sc.next();
            System.out.println("Enter student "+ (i+1) + " marks:");
            int marks = sc.nextInt();
            Student s = new Student(name,marks);
            studentArray[i] = s;
        }
        for(Student s : studentArray){
            System.out.println(s);
        }
        double sum = 0;
        for(Student s : studentArray){
            sum += s.getMarks();
        }
        double average = sum/n;
        System.out.println("The average is " + average);
    }

}