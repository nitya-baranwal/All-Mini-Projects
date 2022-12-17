package Q1;

public interface X {

    void oneAX();

    default void oneDX() {
        System.out.println("oneDX() inside interface X");
    }

    static void oneSX() {
        System.out.println("oneSX() inside interface X");
    }
}

