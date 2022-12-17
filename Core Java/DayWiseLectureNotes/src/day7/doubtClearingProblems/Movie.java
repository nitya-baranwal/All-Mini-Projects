package day7.doubtClearingProblems;

public class Movie {

    private int duration;
    private String name;

    Movie(){}

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Movie(int d, String n){
        this.duration = d;
        this.name = n;
    }



}
