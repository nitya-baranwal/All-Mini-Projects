package Q1;
import java.util.*;
//Q1) Write the logic to reverse the String given in the parameter without the help of predefined
//        reverse method and return the reversed String:(HINT use Array)
//class Main{
//    public static String reversString(String input){
////write the logic
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a String to reverse");
//        String orignalString = sc.next();
//        String result = reversString(originalString);
//        System.out.println("Original String is :"+ originalString);
//        System.out.println("Reversed String is :"+ result);
//    }
//}

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String originalString = sc.next();
        String result = reverseString(originalString);
        System.out.println("Original String is :"+ originalString);
        System.out.println("Reversed String is :"+ result);

    }
    public static String reverseString(String str) {
        char[] arr = new char[str.length()];
        for(int i=str.length()-1; i>=0; i--) {
            arr[i] = str.charAt(str.length()-i-1);
        }
        StringBuilder newStr = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            newStr.append("" + arr[i]);
        }
        return newStr.toString();
    }
}
