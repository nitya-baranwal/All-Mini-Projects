package q1;

abstract public class Employee {
    int employeeId;
    String employeeName;
    double salary;
    public Employee() {
    }
    public Employee(int employeeId, String employeeName) {
           this.employeeId = employeeId;
           this.employeeName = employeeName;
    }
    abstract void calculateSalary();
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
