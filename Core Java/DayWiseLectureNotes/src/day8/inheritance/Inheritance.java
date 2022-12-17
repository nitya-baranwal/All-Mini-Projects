package day8.inheritance;

public class Inheritance {

    public static void main(String[] args) {
        Fish fish = new Dolphin();
        fish.swim();

//        Fish newFish = new Dolphin();
////        newFish.jump(); //RE: ClassCastException
//        Dolphin fish1 = (Dolphin) newFish;
//        fish1.jump();
    }
}
class Fish{
    void swim(){
        System.out.println("Fish can swim");
    }
}
class Dolphin extends Fish{
    @Override
    void swim(){
        System.out.println("Dolphin can swim");
    }
    void jump(){
        System.out.println("I can jump");
    }
}