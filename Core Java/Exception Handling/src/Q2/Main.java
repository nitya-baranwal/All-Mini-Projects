package Q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 2 numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        findQuotient(a,b);
    }


    static void findQuotient(int a, int b) {
        try{
            System.out.println("The quotient of " + a + "/" + b + " = " + a/b);
        }catch(ArithmeticException e){
            System.out.println("DivideByZeroException caught");
        }finally {
            System.out.println("Inside finally block");
        }
    }

}
