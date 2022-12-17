package Q3;

public class Account {

    String accountNumber;
    double balance;

    Account(String accountNumber){
        this.accountNumber = accountNumber;
    }

    void deposit(int amount) {
        this.balance += amount;
        System.out.println("Deposited amount " + amount);
        System.out.println("Balance " + this.balance);
    }

    double withdraw(int amount) {
        try{
            if(amount > this.balance){
                throw new InsufficientFundsException("Insufficient balance!");
            }else{
                this.balance -= amount;
                System.out.println("Amount withdrawn " + amount);
                System.out.println("Balance " + this.balance);
            }
        } catch(InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
