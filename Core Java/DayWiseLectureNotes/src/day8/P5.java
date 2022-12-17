package day8;
import java.lang.*;
import java.lang.reflect.Array;

public class P5 {

    public static void main(String[] args) {
        int[][] a = {
                {1,-2,3},
                {-4,-5,6,9},
                {7},
        };

        for(int[] i : a){
            for(int j : i){
                System.out.println(j);
            }
        }
    }
}
