package Q1;

public class ZImpl implements Z {

    @Override
    public void oneAX() {
        System.out.println("oneAX() inside class ZImpl");
    }

    @Override
    public void oneDX() {
        Z.super.oneDX();
        System.out.println("oneDX() inside class ZImpl");
    }

    @Override
    public void oneAY() {
        System.out.println("oneAY() inside class ZImpl");
    }


    @Override
    public void oneAZ() {
        System.out.println("oneAZ() inside class ZImpl");
    }
}
