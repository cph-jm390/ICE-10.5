import java.util.ArrayList;
import java.util.List;

public class Scoreboard extends Player {
    //TODO lav kommando !points eller !score for at få visuelt display op for player points

    private ArrayList <Integer> points=new ArrayList<>();

    public Scoreboard(String name, int playerNum, boolean isDealer, List<Double> handValue, ArrayList<Integer> points) {
        super(name, playerNum, isDealer,handValue);
        this.points=points;
    }


    public ArrayList<Integer> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Integer> points) {
        this.points = points;
    }



}
