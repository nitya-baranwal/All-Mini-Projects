package liveClass;

public class _11VarArgs {
    void print(int i){
        System.out.println(i);
    }
    void print(int i, int j){
        System.out.println(i+" "+j);
    }
    static void print(Integer... integers){
        for (Integer i: integers
        ) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
//        _11VarArgs obj= new _11VarArgs();
//        obj.print(1,2,3);
        print(1,2,3);
    }
}