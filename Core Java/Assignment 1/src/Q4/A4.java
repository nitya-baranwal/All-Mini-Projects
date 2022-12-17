package Q4;
import java.io.*;
import java.util.Scanner;

public class A4 {
    static int number;
    public static void main(String[] args) {
       if(args.length>2){
           System.out.println("Error");
       }
       if(args.length == 1) {
           String num = args[0];
           number = Integer.parseInt(num);
       }
       if(args.length == 2) {
           String num1 = args[0];
           String num2 = args[1];
           int n1 = Integer.parseInt(num1);
           int n2 = Integer.parseInt(num2);
           number = Math.abs(n1 - n2);
//           System.out.println(number);
       }
//       A4 numm = new A4();
       int res = factorial(number);
        System.out.println(res);
    }
    public static int factorial(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        return n*factorial(n-1);
    }
}

//Q4)Take the Command Line Argument and print the factorial of that number.
//        Case1-
//        If only one number is supplied then simply find the factorial of that number
//        Input5
//        Output120
//        Case2-
//        If two numbers are supplied then find the absolute difference of the two numbers and then find
//        the factorial of the resulting number.
//        Input5 8
//        Output6
//        Case 3-
//        If three or more numbers are suppliedInput5 6 8 9
//        OutputError
