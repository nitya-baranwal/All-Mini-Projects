package q3;

public class Main {

    public static void fun(){

        try{
            int[] array = new int[10];
            array[11] = 100;
            Object object = null;
            object.toString();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("the end");
        }

    }

    public static void main(String[] args) {
        fun();

    }
}
