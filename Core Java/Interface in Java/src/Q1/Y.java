package Q1;

public interface Y {

    void oneAY();

    default void oneDY() {
        System.out.println("oneDY() inside interface Y");
    }

    static void oneSY() {
        System.out.println("oneSY() inside interface Y");
    }
}
