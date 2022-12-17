package Q3;

import java.util.Scanner;

public class AccountDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.next();

        Account account = new Account(accountNumber);
        account.deposit(120000);
        account.withdraw(150000);
    }
}
