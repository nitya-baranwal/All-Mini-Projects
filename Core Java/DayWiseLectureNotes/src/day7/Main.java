package day7;
//You Problem
//Write a non-static method inside class Main,
//*  which will take an initialized integer array and return the largest number from the supplied array.
//        * call this method from the main method of main class by supplying an initialized integer array
//* and print the returned result.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<arr.length; i++) {
//            arr[i] = scn.nextInt();
//        }

//        int[] arr = {12,23,34,56,67};

        Main obj = new Main();
//        int ans = obj.f(arr);
//        System.out.println(ans);

        System.out.println(Integer.MAX_VALUE);
    }

    int f(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int num : arr) {
            if(max<num) {
                max = num;
            }
        }
        return max;
    }


}
