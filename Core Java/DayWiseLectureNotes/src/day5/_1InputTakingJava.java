package day5;
import java.util.Scanner;


public class _1InputTakingJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scanner.nextInt();
        System.out.println("enter your name");
        String name = scanner.next();
        System.out.println(name + " " + age);
        scanner.close();
    }
}



