package day5;

public class Movie {

    int ticketNum;
    String movieName;

    public static void main(String[] args) {
        Movie obj = new Movie(555,"Sita Ramam");
        System.out.println(obj.ticketNum);
    }

    Movie() {
        System.out.println("Movie");
    }
    Movie(int ticket, String movie){
        ticketNum = ticket;
        movieName = movie;
    }
}
