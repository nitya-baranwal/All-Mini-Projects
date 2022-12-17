package _3sumofnaturalnumbers;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        int num = 10;
        int ans = sumOfN(num);
        System.out.println(ans);
    }

    public static int sumOfN(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        return sum;
    }
}
