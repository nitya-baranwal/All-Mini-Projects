package q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        int key = sc.nextInt();
        List<Integer> nums = new ArrayList<>();

//        int n = sc.nextInt();

        System.out.println("Enter the numbers to be added in ArrayList or 'n' to stop");

        do{
            nums.add(sc.nextInt());
        } while(sc.hasNextInt());


//        System.out.println(nums + "----" + key);
        int answer = count(nums,key);
        System.out.println(answer);

    }

    public static int count(List<Integer> list, int key) {
        int c = 0;
        for(int i = 1; i < key; i++){
            if(list.contains(i)){
                c++;
            }
        }
        return c;
    }
}
