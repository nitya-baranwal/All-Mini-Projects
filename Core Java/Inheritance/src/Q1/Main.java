package Q1;

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}
class Parrot extends Bird {
    public void fly() {
        System.out.println("I am flying");
    }
    public void sing() {
        System.out.println("I am singing");
    }
}
public class Main{
    public static void main(String[] args) {
        Bird b1 = new Parrot();
        b1.fly(); //calling fly() method parrot class

        Parrot b2 = (Parrot) b1; //downcasting parrot reference to parrot class object
        b2.sing(); // calling sing() method parrot class
    }
}