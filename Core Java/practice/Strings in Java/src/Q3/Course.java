package Q3;

import java.util.Scanner;

public class Course {

    int courseId;
    String courseName;
    int courseFee;

    void displayCourseDetails(){

        System.out.println("Course Id is: " + this.courseId);
        System.out.println("Course Name is: " + this.courseName);
        System.out.println("Course Fee is: " + this.courseFee);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String user = scn.nextLine();
        String pass = scn.nextLine();
        authenticate(user,pass);
    }

    static void authenticate(String username, String password){
        if((username.equals("Admin")) && (password.equals("1234"))){
            Scanner scn = new Scanner(System.in);
            Course course = new Course();
            course.courseId = scn.nextInt();
            scn.nextLine();
            course.courseName = scn.nextLine();
            course.courseFee = scn.nextInt();
            course.displayCourseDetails();
        } else{
            System.out.println("Invalid Username or Password");
        }
    }
}
