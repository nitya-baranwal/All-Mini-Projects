package q4;

abstract public class A4 {

    abstract void abstractMethod();

    public static void main(String[] args) {
        A4 a = new childOfA4();
        a.abstractMethod();
    }
}
class childOfA4 extends A4{

    @Override
    void abstractMethod() {
        System.out.println("Overridden abstract method body initialized inside concrete child class");
    }
}