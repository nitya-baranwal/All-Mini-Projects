package q5;

public class Animal {

    void eat(){
        System.out.println("Animal is eating");
    }

    public static void main(String[] args) {

        Animal a = new Dog();

        boolean checkInstance1 = a instanceof Animal;
        System.out.println(checkInstance1);    //true

        a.eat();    //Dog is eating

        Dog d = (Dog) a; // downcasting

        boolean checkInstance2 = d instanceof Dog;
        System.out.println(checkInstance2);    //true

        d.eat();    //Dog is eating
        d.bark();  //Dog is barking


    }
}

class Dog extends Animal{

    @Override
    void eat() {
        System.out.println("Dog is eating");
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}
