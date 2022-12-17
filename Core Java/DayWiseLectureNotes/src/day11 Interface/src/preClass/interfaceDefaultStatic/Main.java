package preClass.interfaceDefaultStatic;

public class Main implements Intr {

    enum Color{

        GREEN,RED,PINK,YELLOW;
    }


    @Override
    public void funX() {
        System.out.println("inside funX of main class");
    }

    @Override
    public void funY() {
        System.out.println("inside funY of main class");
    }

    public static void main(String[] args) {

        Intr i1 = new Main(); // only two values can be assigned, either null or implemented class object
    }
}
