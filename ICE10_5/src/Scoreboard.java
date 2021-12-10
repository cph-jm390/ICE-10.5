import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scoreboard extends Player {
    //TODO lav kommando !points eller !score for at få visuelt display op for player points

    private ArrayList <Integer> points=new ArrayList<>();

    public Scoreboard(String name, int playerNum, boolean isDealer, List<Double> handValue, boolean hasWon, ArrayList<Integer> points) {
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
    /*Public void printScores() {
        int total = 0;
        for(int i = 0; i < Main.players.get(i).getPlayerScore(); i++)
        {
            System.out.println(Main.players.get(i).getName() + "has a score of" + Main.players.get(i).getPlayerScore());
            total += Main.players.get(i).getPlayerScore();
        }
    }*/


    public void printScores() {
        Collections.sort(Main.players, new SortByPoints());

        // Displays the final score board
        System.out.println();
        System.out.println("\n***** Lets look at the scoreboard! *****\n");
        for (int i=0; i<Main.players.size(); i++)
            System.out.println(Main.players.get(i).getPlayerScore());
    }
}





