package q1;

public class TemporaryEmployee extends Employee{

    private int hoursWorked;
    private int hourlyWages;

    public TemporaryEmployee() {
    }

    public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }

    @Override
    void calculateSalary() {
        System.out.print("Temporary Employee salary: ");
        this.salary = this.hoursWorked * this.hourlyWages;
        System.out.println(this.salary);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
