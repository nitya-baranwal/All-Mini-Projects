package q1;

import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SortedSet<Product> list = new TreeSet<>();

        for(int i = 0; i < 4; i++) {
            System.out.println("Enter name of product " + (i+1));
            String name = sc.next();
            System.out.println("Enter price of product " + (i+1));
            double price = sc.nextDouble();
            Product p1 = new Product(name,price);
            list.add(p1);
        }

        for(Product p : list) {
            System.out.println(p);
        }

    }
}
