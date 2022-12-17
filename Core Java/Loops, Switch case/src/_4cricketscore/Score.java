package _4cricketscore;

public class Score {

    String batsman;
    int runs;

    public static void main(String[] args) {

        Score b1 = new Score();
        b1.batsman = "MS Dhoni";
        int totalScore = calScore(2,4,6,1,1);
        b1.runs = totalScore;
        System.out.println("Total runs made by " + b1.batsman + " = " + b1.runs);
    }

    public static int calScore(int r1, int r2, int r3, int r4, int r6) {
        int sum = r1 + r2*2 + r3*3 + r4*4 + r6*6;
        return sum;
    }
}
