package day6;

public class _2CallingAConstructorUsingThis {


//    _2CallingAConstructorUsingThis(){
        //call to this() should always be the first statement in a const.
//        this(10);//this will point to the current construtor
//        System.out.println("default const.");
//    }
    _2CallingAConstructorUsingThis(int x){

        System.out.println("1 arg const.");
    }

    public static void main(String[] args) {
//        _2CallingAConstructorUsingThis object= new _2CallingAConstructorUsingThis();
        Movies m = new Movies(2,3);
        System.out.println(m.duration + " " + m.song);
    }
}

class Movies {
    int duration;
    int song;

    Movies(int a, int b){
        duration = a;
        song = b;
    }

}
