package Q3;

import java.util.Scanner;

abstract public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<200) {
            System.out.println("Please enter a valid amount");
            return;
        }

        if(n > 1000) {
            Hotel h = new TajHotel(n);
        } else {
            Hotel h = new RoadSideHotel(n);
        }
    }
   abstract public Hotel provideFood(int amount);

}
