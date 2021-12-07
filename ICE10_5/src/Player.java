import java.util.ArrayList;

public class Player {
   public String name;
    private int playerNum;
    private int playerScore;
    private boolean isDealer;

    private ArrayList<Player> players=new ArrayList<>();

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Player(String name, int playerNum, boolean isDealer) {
        this.name = name;
        this.playerNum = playerNum;
        this.isDealer=isDealer;
    }

    public boolean isDealer() {
        return isDealer;
    }

    public void setDealer(boolean dealer) {
        isDealer = dealer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", playerNum=" + playerNum +
                ", isDealer=" + isDealer +
                ", playerScore=" + playerScore +
                '}';
    }
}