package q2_final_keyword;

public class Parent {

    public final int number;
    Parent(int number){
        if(number>=1 && number<=10) {
            this.number = number;
        } else {
            this.number = 0;
            System.out.println("Invalid number");
        }
    }
    void method1(){
        System.out.println("method1 inside Parent class");
    }
    private void method2(){
        System.out.println("method2 inside Parent class");
    }
    void method3();

    public static void main(String[] args) {
        Parent parent = new Child(5);
        parent.method1();
        parent.method2();
        parent.method3();
        Child newparent = (Child) parent;
        newparent.method4();
    }
}
final class Child extends Parent{
    Child(int n) {
        super(n);
    }
    @Override
    void method1() {
        super.method1();
        System.out.println("method1 inside Child class");
        System.out.println(this.number);
    }

    @Override
    void method3() {
        System.out.println("method3 inside Child class");
    }
    void method4() {
        System.out.println("method4 inside Child class");
    }
}