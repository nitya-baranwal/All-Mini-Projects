package day5;

public class Demo {

    void fun1(int i){
        System.out.println("inside fun1(int) of Demo");
//10000 line of code
    }
    void fun1(byte b){
        System.out.println("inside fun1(byte) of Demo");
//500 line of code
    }

    public static void main(String[] args)
    {
        Demo d1=new Demo();
        byte x=20;
        d1.fun1(x); // it will give the priority to the nearest one.
    }
}


