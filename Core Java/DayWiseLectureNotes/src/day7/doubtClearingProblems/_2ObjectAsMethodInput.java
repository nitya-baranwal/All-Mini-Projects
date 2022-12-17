package day7.doubtClearingProblems;

public class _2ObjectAsMethodInput {

    public static void main(String[] args) {

        Movie movie = new Movie(2,"Sita Ramam");
        objAsInput(movie);
        Movie m2 = returnObject();
        m2.setDuration(3);
        m2.setName("RRR");
        objAsInput(m2);
    }

    static void objAsInput(Movie m){
        System.out.println(m.getName());
        System.out.println(m.getDuration());
    }

    static Movie returnObject() {
        return new Movie();
    }
}
