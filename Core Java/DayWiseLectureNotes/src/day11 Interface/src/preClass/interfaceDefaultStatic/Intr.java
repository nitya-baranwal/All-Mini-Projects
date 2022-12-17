package preClass.interfaceDefaultStatic;

public interface Intr {

    int x = 10;

    void funX();
    void funY();

    default void funZ(){
        System.out.println("default method funZ of preClass.interfaceDefaultStatic.IntrImpl.Intr");
    }

    static void fun1() {
        System.out.println("inside static method of preClass.interfaceDefaultStatic.IntrImpl.Intr");
    }
}