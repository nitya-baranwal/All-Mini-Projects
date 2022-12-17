package Q4;

public class Test implements Intr{

    public int[] display(int p) {
        int c = 0;
        int[] arr = new int[p+1];
        for(int i = 2; i<=p; i++){
            if(prime(i)) {
                arr[i] = i;
                System.out.print(i+" ");
            }
        }
        return arr;
    }
    public boolean prime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
