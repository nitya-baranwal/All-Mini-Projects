package Q4;

import java.util.*;
import java.util.List;
import java.util.Scanner;

public class Main extends Employee {


    static int employeeCount = 0;
    static List<Employee> empList = new ArrayList<Employee>();

    
    public static void addEmp(Employee employee){
        boolean flag = true;
        for (int i=0;i< empList.size();i++){
            Employee emp = empList.get(i);
            if(emp.equals(employee)){
                flag = false;
                --employeeCount;
            }
        }
        if(flag) {
            empList.add(employee);
        }
    }


    public static void m() {
        System.out.println("Do you want to Enter the detail of Employee: ? (Y/N)");
    }

    public static void main(String[] args) {

        System.out.println("...Welcome to Employee Management System....");
        m();

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String yes_no = sc.next();
            if(yes_no.equalsIgnoreCase("y")){

                System.out.println("Enter the Employee Details: " + (++employeeCount));
                System.out.println("--------------------------------");
                System.out.println("Enter the Employee Id:");
                int empId = sc.nextInt();
                System.out.println("Enter the Employee Name:");
                String empName = sc.next();
                System.out.println("Enter the Employee Salary: ");
                double empSalary = sc.nextDouble();
                System.out.println("Enter the Department Id:");
                int deptId = sc.nextInt();
                System.out.println("Enter the Department Name:");
                String deptName = sc.next();
                Employee emp = new Employee(empId,empName,empSalary,deptId,deptName);
                addEmp(emp);
                m();
            }
            else if(yes_no.equalsIgnoreCase("n")){
                System.out.println("Thank you---");
                optionsList();
            }
        }
    }

    public static void optionsList() {
        System.out.println("Enter your choice");
        System.out.println("1: Find Employee in Particular Department");
        System.out.println("2: Remove Particular Employee");
        System.out.println("3: Print Employees in All Departments");
        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();
        if(option == 1) {
            System.out.println("Enter the Department Id:");
            int inputDeptId = sc.nextInt();
            printEmpByDepartment(inputDeptId);
        } else if(option == 2) {
            System.out.println("Enter Department Id:");
            int empDeptId = sc.nextInt();
            System.out.println("Enter the Employee Id:");
            int empId = sc.nextInt();
            removeEmp(empDeptId,empId);
        } else if(option == 3) {
            printAllEmpList();
        } else {

        }
        askToExit();
    }

    public static void printEmpByDepartment(int inputDeptId){
        System.out.println("Employee in Department: " + inputDeptId);
        for(Employee emp : empList) {
            if(emp.getDepartment().getDepartmentId() == inputDeptId){
                System.out.println("Employee Name: " + emp.getEmployeeName());
                System.out.println("Employee Id: " + emp.getEmployeeId());
                System.out.println("Employee Salary: " + emp.getEmployeeSalary());
                System.out.println("======================================");
            }
        }
    }

    public static void printAllEmpList() {

        if(empList.isEmpty()){
            System.out.println("Employee doesn't exists..");
        } else {
            for (Employee emp : empList) {
                System.out.println(emp);
            }
        }

    }

    public static void askToExit() {
        System.out.println("Do you want to Exit: ? (Y/N)");
        Scanner sc = new Scanner(System.in);
        String exitInput = sc.next();
        if(exitInput.equalsIgnoreCase("n")){
            optionsList();
        }
        if(exitInput.equalsIgnoreCase("y")) {
            System.out.println("Thank you---");
        }
    }

    public static void removeEmp(int empDeptId,int empId){
        for(int i = 0; i < empList.size(); i++ ){
            Employee emp = empList.get(i);
            if(emp.getDepartment().getDepartmentId() == (empDeptId) && emp.getEmployeeId() == empId){
                empList.remove(emp);
                System.out.println(emp.getEmployeeName() + " Employee is removed from the department " + empDeptId + "successfully");
            }
        }
    }

}
