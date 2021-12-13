import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scoreboard /*extends Player*/ {
    //TODO lav kommando !points eller !score for at få visuelt display op for player points



    /*public Scoreboard(String name, int playerNum, boolean isDealer, List<Double> handValue, boolean hasWon, ArrayList<Integer> points) {
        super(name, playerNum, isDealer, handValue, hasWon);
        this.points = points;
    }

    public ArrayList<Integer> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Integer> points) {
        this.points = points;
    }


    //virker måske ikke.
    Public void printScores() {
        int total = 0;
        for(int i = 0; i < Main.players.get(i).getPlayerScore(); i++)
        {
            System.out.println(Main.players.get(i).getName() + "has a score of" + Main.players.get(i).getPlayerScore());
            total += Main.players.get(i).getPlayerScore();
        }
    }*/


    public void printScores() {
        for(int i=0;i<Main.players.size();i++)
            System.out.println(Main.players.get(i).getName()+"         has "+Main.points.get(i)+" points");
    }
}





