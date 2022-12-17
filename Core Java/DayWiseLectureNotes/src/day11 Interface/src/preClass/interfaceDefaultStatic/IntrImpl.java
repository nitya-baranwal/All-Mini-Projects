package preClass.interfaceDefaultStatic;

public class IntrImpl implements Intr {


    @Override
    public void funX() {
        System.out.println("inside funX of Main");
    }

    @Override
    public void funY() {
        System.out.println("inside funY of Main");
    }


    public static void main(String[] args) {
        Intr i1 = new IntrImpl();
        i1.funZ();

        Intr.fun1();
        //restaurant example
        //menu === interface
        //kitchen == interface implementing class
    }


}
