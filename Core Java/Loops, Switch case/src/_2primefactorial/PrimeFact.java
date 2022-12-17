package _2primefactorial;

public class PrimeFact {

    public static void main(String[] args) {
        factors(12);
    }
    public static void factors(int num) {

        for(int i=1; i<=num; i++){
            if(num %i  == 0) {
                System.out.print(i+"\t");
            }
        }
    }
}