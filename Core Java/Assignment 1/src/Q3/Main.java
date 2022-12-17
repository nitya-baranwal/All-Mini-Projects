package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= String.valueOf(sc.nextLine().trim().toCharArray());
//        System.out.println(str);
        int c = str.length();

        int[] arr = new int[c];
        for(int i=0; i<c; i++){
            if (str.charAt(i) >= Integer.MIN_VALUE && str.charAt(i) <= Integer.MAX_VALUE) {
                arr[i] = str.charAt(i);
                System.out.println(Integer.valueOf(arr[i]));
            }
//            System.out.println(arr[i]);
        }
        for(int i=0; i<arr.length; i++) {
//            System.out.println(arr[i]);
        }

//        sc.close();
        Main m = new Main();
//        boolean f = m.primeNumber(12);
//        System.out.println(f);
//        int[] res = m.findAndReturnPrimeNumbers(arr);
//        for(int val : res) {
//            System.out.println(val);
//        }
    }
    public static int[] findAndReturnPrimeNumbers(int[] arr){
        int[] newA = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
//                            System.out.println(arr[i]);
            if(primeNumber(arr[i])) newA[i] = arr[i];
        }
//        for(int val : newA) {
//            System.out.println(val);
//        }
        return newA;
    }
    public static boolean primeNumber(int num) {
        for(int i=2; i<num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
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
//}
