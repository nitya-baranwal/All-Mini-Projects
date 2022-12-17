package Q7;
//        Explain the concept of static in Java

//Answer: Static keyword is used for variables, methods, etc.  which are stored in RAM during compile time.
// All static variable and methods are part of a class.
// Static literals can be called anywhere inside the class, whereas non- static are called by creating new object,etc.

public class A7 {
    static int num = 200;
    static String str = "LuckyNitya";

    public static void main(String[] args) {
        num = 100;
        str = "Nitya";
        //static variable being called in static method
        System.out.println(num + " " + str);

        A7 newF = new A7();
        newF.num = 5;
        newF.str = "Lucky";
        //non-static method being called in static method
        newF.fun();
    }
    public void fun() {
        System.out.println(num + " " + str);
    }
}
