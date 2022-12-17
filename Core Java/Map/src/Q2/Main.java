package Q2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeMap<Student, String> tm = new TreeMap<>(new StudentMarksComp());

        tm.put(new Student(11, "Nitya", 100),"AP");
        tm.put(new Student(12, "Lucky", 91), "KN");
        tm.put(new Student(13, "Richa", 55), "NCT");
        tm.put(new Student(14, "Archie", 73), "UP");
        tm.put(new Student(14, "Rashi", 64), "MP");

        Set<Map.Entry<Student, String>> set = tm.entrySet();

        for(Map.Entry<Student, String> me: set) {

            System.out.println("Topper student of state :" + me.getValue());
            System.out.println("************************************");

            Student student = me.getKey();

            System.out.println("Roll :" + student.getRoll());
            System.out.println("Name :" + student.getName());
            System.out.println("Marks :" + student.getMarks());

        }



//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of students");
//        int n = sc.nextInt();
//
//        HashMap<Student,String> hm = new HashMap<>();
//        System.out.println("Enter students details");
//        for(int i = 1; i <= n; i++ ) {
//            Student s1 = new Student();
//            System.out.println("Enter student " + i + " name");
//            s1.setName(sc.next());
//            System.out.println("Enter student " + i + " marks");
//            s1.setMarks(sc.nextInt());
//            System.out.println("Enter student " + i + " roll");
//            s1.setRoll(sc.nextInt());
//            System.out.println("Enter student " + i + " state");
//            String state = sc.next();
//            hm.put(s1,state);
//        }





    }

}
