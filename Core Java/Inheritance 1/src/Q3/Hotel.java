package Q3;

public class Hotel {
    Hotel(String str){
        System.out.print("Food ordered from " + str);
    }
}
class TajHotel extends Hotel {
    TajHotel(int n){
        super("Taj Hotel");
    }
}
class RoadSideHotel extends Hotel {
    RoadSideHotel(int n){
        super("RoadSide Hotel");
    }
}

//Q3) Create a super class Hotel, now create two classes TajHotel and RoadSideHotel, that extend
//        the Hotel class. Create a Demo class and inside the Demo class define a method
//        as follows:
//public Hotel provideFood(int amount)
//        Implement the above method as follows:
////write the logic if the supplied amount is more than 1000
////then return the object of TajHotel class
////if the supplied amount is greater than 200 and less than 1000
////then return the object of RoadSideHotel class
//        From the main method of the Demo class, call the provideFood
//        method by taking input from the user using Scanner class.
//        If the user supplies the valid amount then call all the methods of the
//        respective classes otherwise print the message: Please Enter a
//        valid amount