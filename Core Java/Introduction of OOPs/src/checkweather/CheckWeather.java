package checkweather;

public class CheckWeather {

    public static void main(String[] args) {
        boolean isSnowing = false;
        boolean isRaining = false;
        double temperature = 50.4;
        if(isSnowing == true || isRaining == true || temperature<50.0) {
            System.out.println("Let's stay home.");
        } else{
            System.out.println("Let's go out!");
        }
    }
}