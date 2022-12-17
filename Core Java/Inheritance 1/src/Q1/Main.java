package Q1;
public class Main {

    public static Person generatePerson(Person person){
        return person;
    }

    public static void main(String[] args) {
        Person student = generatePerson(new Student());
        student.address.city = "Chennai";
        student.address.pinCode = "60001";
        student.address.state = "TN";

        Student s1 = (Student) student;
        s1.studentId = 1;
        s1.courseEnrolled = "JA111";
        s1.courseFee = 300000;

        Person instructor = generatePerson(new Instructor());
        instructor.address.city = "Chennai";
        instructor.address.pinCode = "60001";
        instructor.address.state = "TN";

        Instructor i1 = (Instructor) instructor;
        i1.instructorId = 456;
        i1.salary = 45612;

        System.out.println(s1);
        System.out.println(i1);
    }
}

//    Sample Output:
//        Student [studentId=1, courseFee=300000, courseEnrolled=JA111,
//        address=Address [city=Chennai, state=TN, pincode=60001]]
//        Instructor [instructorId =456, salary=45612, address=Address [city=Chennai,
//        state=TN, pinCode=60001]]