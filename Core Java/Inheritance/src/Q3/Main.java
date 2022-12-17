package Q3;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Pablo";
        emp.age = 23;
        emp.salary = 45000;
        emp.address = "BLR";
        emp.phoneNum = "5545676544";
        emp.Department = "Frontend";
        emp.Specialisation = "CSS";
        emp.display();
        emp.printSalary(emp.salary);


        Manager mngr = new Manager();
        mngr.name = "Pandey";
        mngr.age = 45;
        mngr.salary = 90000;
        mngr.address = "NDLS";
        mngr.phoneNum = "9807876756";
        mngr.Department = "Backend";
        mngr.Specialisation = "Java";
        mngr.display();
        mngr.printSalary(mngr.salary);
    }

}
class Member {
    String name;
    int age;
    String phoneNum;
    String address;
    double salary;

    public void printSalary(double salary){
        System.out.println("Salary of " + this.name + " is: " + this.salary);
    }
    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Phone Number: " + this.phoneNum);
        System.out.println("Address: " + this.address);
    }
}
class Employee extends Member {
    String Specialisation;
    String Department;
}

class Manager extends Member {
    String Specialisation;
    String Department;
}