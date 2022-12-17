package bankAcc;

public class Account {

        String customerName; //cust name
        static String bankName = "HDFC"; //bank name
        double balance; // acc bal
        static int ifscCode; // ifsc code

        public static void main(String[] args) {

//          Account.bankName = "HDFC";
            Account myAcc = new Account();
            myAcc.balance = 789543291.258;
            myAcc.customerName = "Nitya";

            Account yourAcc = new Account();
            yourAcc.balance = 85463728.98;
            yourAcc.ifscCode = 123;
            yourAcc.customerName = "Lucky";


            System.out.println(myAcc.customerName);
            System.out.println(myAcc.balance);
            System.out.println(myAcc.ifscCode);

            System.out.println(yourAcc.customerName);
            System.out.println(myAcc.balance);
            System.out.println(myAcc.ifscCode);
            System.out.println(myAcc.bankName);
            run();
        }

        public static void run() {

            Account obj = new Account();
            System.out.println(obj.bankName);
        }
}