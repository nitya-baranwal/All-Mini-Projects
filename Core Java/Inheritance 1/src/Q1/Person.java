package Q1;
//Sample OutPut:
//        Student [studentId=1, courseFee=300000, courseEnrolled=JA111,
//        address=Address [city=Chennai, state=TN, pincode=60001]]
//        Instructor [instructorId =456, salary=45612, address=Address [city=Chennai,
//        state=TN, pinCode=60001]]
public class Person {
    String name;
    String gender;
    Address address = new Address();

    public static Person generatePerson(Person person){
        return person;
    }
}
class Address {
    String city;
    String state;
    String pinCode;
}
class Instructor extends Person {
    int instructorId;
    int salary;
    public String toString() {
        return "Instructor [instructorId=" + this.instructorId + ", salary=" +
                this.salary +  ", address=Address [city=" + this.address.city +
                ", state=" + this.address.state  + ", pincode=" + this.address.pinCode + "]]";
    }
}
class Student extends Person {
    int studentId;
    String courseEnrolled;
    int courseFee;
    public String toString() {
        return "Student [studentId=" + this.studentId + ", courseFee=" +
                this.courseFee + ", courseEnrolled=" + this.courseEnrolled + ", address=Address [city=" +
                this.address.city + ", state=" + this.address.state  + ", pincode=" + this.address.pinCode + "]]";
    }
}