package Q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = scn.nextLine();
        System.out.println("Enter the character position you want to access:");
        int i= scn.nextInt();
        System.out.println("Character at position 2 is:");
        char ch = str.charAt(i);
        System.out.println(ch);
    }
}
