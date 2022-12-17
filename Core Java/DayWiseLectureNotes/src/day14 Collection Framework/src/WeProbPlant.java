import java.util.Iterator;
import java.util.*;

public class WeProbPlant {

    public static void main(String[] args) {
        Plant p1 = new Plant(12, "yellow");
        Plant p2 = new Plant(15, "green");

        List<Plant> plantList = new ArrayList<>();
        plantList.add(p1);
        plantList.add(p2);

        plantList.forEach(plant -> System.out.println(plant));

    }
}
