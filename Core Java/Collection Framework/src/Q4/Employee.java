package Q4;

import java.util.Objects;

public class Employee {

    private int employeeId;
    private String employeeName;
    private double employeeSalary;
    private Department department;

    public Employee() {

    }

    public Employee(int employeeId, String employeeName, double employeeSalary, int departmentId, String departmentName) {
        System.out.println("Employee Details added successfully..");
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        Department department1 = new Department(departmentId,departmentName);
        this.department = department1;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        if(employeeId == employee.employeeId && employeeSalary == employee.employeeSalary &&
            employeeName.equals(employee.employeeName)
                && this.getDepartment().getDepartmentId() == employee.getDepartment().getDepartmentId()
        && this.getDepartment().getDepartmentName().contentEquals(employee.getDepartment().getDepartmentName())){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, employeeName, employeeSalary, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + employeeId +
                ", name='" + employeeName + '\'' +
                ", salary=" + employeeSalary +
                ", department=" + department +
                '}';
    }
}
