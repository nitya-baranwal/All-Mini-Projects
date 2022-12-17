package Q2;

import java.util.Scanner;

public class Demo {

    public Hotel provideFood(int amount){

        if(amount > 1000) {
            new TajHotel().chickenBiryani();
            new TajHotel().masalaDosa();
            new TajHotel().welcomeDrink();
            return new TajHotel();
        } else if(amount >= 200) {
            new RoadSideHotel().chickenBiryani();
            new RoadSideHotel().masalaDosa();
            return new RoadSideHotel();
        } else {
            System.out.println("Enter a valid amount");
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount");
        int amount = sc.nextInt();

        Demo hotel = new Demo();
        hotel.provideFood(amount);

    }
}
