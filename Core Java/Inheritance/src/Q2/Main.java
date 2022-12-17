package Q2;

public class Main {
    public static void main(String[] args) {
        Animal[] arrayAnimal = new Animal[3];
        arrayAnimal[0] = new Dog();
        arrayAnimal[1] = new Cat();
        arrayAnimal[2] = new Tiger();

        Animal a1 = arrayAnimal[0];
        Animal a2 = arrayAnimal[1];
        Animal a3 = arrayAnimal[2];

        a1.eat();
        a1.walk();
        a1.makeNoise();
        a2.eat();
        a2.walk();
        a2.makeNoise();
        a3.eat();
        a3.walk();
        a3.makeNoise();
    }
}
class Animal {
    public void makeNoise() {
        System.out.println("Animal making Noise");
    }
    public void eat() {
        System.out.println("Animal is eating");
    }
    public void walk() {
        System.out.println("Animal is walking");
    }
}
class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Barking...");
    }
}
class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Meow...");
    }
}
class Tiger extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Roaring...");
    }
}