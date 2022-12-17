package Q1;

import java.util.Scanner;
//   == double equals operator compares the addresses of two strings/objects
// equals() method: compares the content and not the address.
public class A1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        String s3 = s1;

        if(s1==s3){
            System.out.println("== operator compares by reference");
        }
        if(s1==s2){
            System.out.println("s1,s2 have same reference");
        } else{
            System.out.println("s1, s2 might have same value but they are not equal(==) as their reference is different in string pool");
        }

        if(s1.equals(s2)){
            System.out.println("equals() compares compares character by character");
        }else{
            System.out.println("equals() checked strings are not same");
        }
    }
}
