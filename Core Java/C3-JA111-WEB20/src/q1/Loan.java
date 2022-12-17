package q1;

import java.util.Objects;

public class Loan {

    public void calculateLoanAmount(){
        System.out.println("Loan amount could not be calculated, null details provided");
    }

    public void calculateLoanAmount(Employee employeeObj){
        if(employeeObj == null){
            System.out.println("Loan amount could not be calculated, null details provided");
        } else {
            employeeObj.calculateSalary();
            double loanAmount;
            if (employeeObj instanceof PermanentEmployee) {
                loanAmount = 0.15 * employeeObj.salary;
                System.out.print("Loan amount for Permanent Employee: ");
            } else if (employeeObj instanceof TemporaryEmployee) {
                System.out.print("Loan amount for Temporary Employee: ");
                loanAmount = 0.10 * employeeObj.salary;
            } else {
                loanAmount = 0.0;
            }
            System.out.println(loanAmount);
        }
    }


}
