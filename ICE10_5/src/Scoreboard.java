import java.util.ArrayList;

public class Scoreboard extends Player {
    //TODO lav kommando !points eller !score for at få visuelt display op for player points

    private ArrayList <Integer> points=new ArrayList<>();

    public Scoreboard(String name, int playerNum, ArrayList<Integer> points) {
        super(name, playerNum);
        this.points=points;
    }


    public ArrayList<Integer> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Integer> points) {
        this.points = points;
    }



}
