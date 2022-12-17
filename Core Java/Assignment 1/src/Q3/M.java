package Q3;

import java.util.Scanner;

public class M {
    public static boolean checkPrime(int n) {
        if(n<=2){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    public static int[] findAndReturnPrimeNumbers(int[] inputArray){
        int[] ans = new int[inputArray.length];
        for(int i=0; i< inputArray.length; i++) {
            if(checkPrime(inputArray[i])) ans[i]=inputArray[i];
        }
        return ans;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int[] arr = {10,12,5,50,11,14,15};

        int[] r = findAndReturnPrimeNumbers(arr);
        for (int val: r) {
            if(val != 0) System.out.println(val);
        }
    }
}


//Q3) Finding prime number inside an array:
//public class Main{
//    public int[] findAndReturnPrimeNumbers(int[] inputArray){
////write the logic to iterate through the supplied inputArray and return array of prime
//        numbers
////if no prime number is found then return the empty array.
//    }
//    public static void main(String[] args){
////Create the object of Main class
////on the object of Main class call the findAndReturnPrimeNumbers method
////by supplying the following array as the parameter
//        int[] arr = {10,12,5,50,11,14,15};
////print each element from the returned array of findAndReturnPrimeNumbers method
////if findAndReturnPrimeNumbers method returns an empty array then print the following
//        message:
//// "Prime number not found in the supplied Array"
//    }