package Q4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Test t = new Test();
        int[] arr = t.display(n);

    }
}
