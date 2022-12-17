package q4;

import java.util.HashMap;
import java.util.Set;

public class Plant {

    String name;
    int price;

    Plant() {}

    Plant(String name, int price){
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {

        HashMap<String,Integer> nursery = new HashMap<>();
        Plant p1 = new Plant("Cactus",300);
        nursery.put(p1.name,p1.price);

        Plant p2 = new Plant("Money Plant",200);
        nursery.put(p2.name,p2.price);

        Plant p3 = new Plant("Daisy",200);
        nursery.put(p3.name,p3.price);

        Plant p4 = new Plant("Orchids",500);
        nursery.put(p4.name,p4.price);

        Plant p5 = new Plant("Lilly",1000);
        nursery.put(p5.name,p5.price);

        Set<String> keySet = nursery.keySet();

        for(String name : keySet) {
            System.out.println("Plant name: " + name + ", Price: " + nursery.get(name));
        }
    }
}
