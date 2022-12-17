package Q6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int i = scn.nextInt();

        String ss = str.substring(0,i);
        System.out.println(ss);
    }
}
