package day8.inheritance;

public class Hierarchical {
    public static void main(String[] args) {

    }

}
class Pet {
    void speak(){
        System.out.println("Pet speaking");
    }
}
class Dog extends Pet{
    @Override
    void speak(){
        System.out.println("Dog barking");
    }
}
class Cat extends Pet {

    @Override
    void speak() {
        System.out.println("Cat meowing");
    }
}