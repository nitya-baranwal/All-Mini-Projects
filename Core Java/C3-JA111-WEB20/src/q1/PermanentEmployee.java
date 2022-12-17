package q1;

class PermanentEmployee extends Employee{

    private double basicPay;

    @Override
    void calculateSalary() {
        System.out.print("Permanent Employee salary: ");
        double pfAmount = this.basicPay * 0.12;
        this.salary = this.basicPay - pfAmount;
        System.out.println(this.salary);
    }
    public PermanentEmployee() {
    }
    public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
