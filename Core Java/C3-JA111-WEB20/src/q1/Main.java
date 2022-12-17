package q1;

public class Main {

    public static void main(String[] args) {
        Loan loanObj = new Loan();
        Employee permanentE = new PermanentEmployee(234,"Nitya", 56400.0);
        loanObj.calculateLoanAmount(permanentE);
        Employee temporaryE = new TemporaryEmployee(123, "Lucky", 40, 1000);
        loanObj.calculateLoanAmount(temporaryE);
        loanObj.calculateLoanAmount(null);
    }
}
