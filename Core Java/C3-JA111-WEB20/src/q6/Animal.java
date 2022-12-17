package q6;

public class Animal {

    void eat(){
        System.out.println("Animal is eating");
    }

    public static void main(String[] args) {

        Animal a = new Dog(); //Upcasting, only possible as Dog is child class of Animal

        boolean checkInstance = a instanceof Animal;  //true
        System.out.println(checkInstance);  // true

        a.eat(); // Dog is eating
    }
}
class Dog extends Animal {

    @Override
    void eat(){
        System.out.println("Dog is eating");
    }

}