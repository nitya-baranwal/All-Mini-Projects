public class Plant {

    int height;
    String color;

    public Plant() {}

    public Plant(int height, String color) {
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
