import java.util.ArrayList;

public class Scoreboard {
    //TODO lav kommando !points eller !score for at få visuelt display op for player points

    private ArrayList <Integer> points=new ArrayList<>();
    private ArrayList <Player> players=new ArrayList<>();

    public ArrayList<Integer> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Integer> points) {
        this.points = points;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Scoreboard(ArrayList<Integer> points, ArrayList <Player> players) {
        this.points = points;
        this.players=players;

    }
}
