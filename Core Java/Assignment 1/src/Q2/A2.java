package Q2;

import java.util.Scanner;

public class A2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m = sc.nextInt();
        System.out.println("Enter the two-D array elements:");
        int[][] twoD = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                twoD[i][j] = sc.nextInt();
            }
        }
        printSumOfEvenEleOfColumn(twoD,n,m);
    }
    public static void printSumOfEvenEleOfColumn(int[][] twoD, int n, int m){
        for(int j=0; j<m; j++) {
            int sum = 0;
            for(int i=0; i<n; i++) {
                if(twoD[i][j]%2 == 0) {
                    sum += twoD[i][j];
                }
            }
            System.out.println(sum);
        }
    }
}
//Q2) Even Sum in Columns
//        Description
//        ● You have to create a 2D array, whose dimensions are N, M, and take the input from the user.
//        ● The value stored in N denotes the number of rows, and the value in M denotes the number of
//        columns
//        ● If the array looks like arr = [1,2,3],[4,5,6],[7,8,9]
//        ● For all columns, you have to print the sum of even elements present in the column
//        4 (Even numbers in the column are, [4]. Therefore, the sum becomes 4)
//        10 (Even numbers in the row are, [2,8]. Therefore, the sum becomes 10)
//        6 (Even numbers in the row are, [6]. Therefore, the sum becomes 6)