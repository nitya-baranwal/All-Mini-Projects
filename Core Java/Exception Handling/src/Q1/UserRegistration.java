package Q1;

import java.util.Scanner;

public class UserRegistration {

    static void registerUser(String username, String userCountry){
        try{
            if(userCountry.equalsIgnoreCase("India")){
                System.out.println("User registration done successfully");
            } else {
                throw new InvalidCountryException("User Outside India cannot be registered");
            }
        }catch(InvalidCountryException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String username = sc.next();
        System.out.println("Enter Your Country:");
        String userCountry = sc.next();

        registerUser(username,userCountry);

    }
}
