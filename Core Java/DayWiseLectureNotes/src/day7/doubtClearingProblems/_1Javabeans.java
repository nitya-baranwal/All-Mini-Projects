package day7.doubtClearingProblems;

public class _1Javabeans {
//Create a JavaBean Movie : Duration: Int, Name: String

//Create 2 objects of this bean and print the values in the main

    public static void main(String[] args) {

        Movie m = new Movie();
        m.setName("Sita Ramam");
        m.setDuration(150);
        String printName = m.getName();
        int printDuration = m.getDuration();
//        System.out.println("Movie name is " + printName);
//        System.out.println("Movie duration is " + printDuration);
        Movie m1 = new Movie(2, "RRR");
        Movie m2 = new Movie(3, "KGF");
        System.out.println(m1.getName() + " " + m1.getDuration());
        System.out.println(m2.getName() + " " + m2.getDuration());
    }
}