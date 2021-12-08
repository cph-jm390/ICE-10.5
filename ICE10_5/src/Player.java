import java.util.ArrayList;
import java.util.List;

public class Player {
   public String name;
    private int playerNum;
    private int playerScore;
    private boolean isDealer;
    private List<Double> handValue=new ArrayList<>();

    private ArrayList<Player> players=new ArrayList<>();

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Player(String name, int playerNum, boolean isDealer,List<Double> handValue) {
        this.name = name;
        this.playerNum = playerNum;
        this.isDealer=isDealer;
        this.handValue=handValue;

    }

    public List<Double> getHandValue() {
        return handValue;
    }

    public void setHandValue(List<Double> handValue) {
        this.handValue = handValue;
    }

    public boolean isDealer() {
        return isDealer;
    }

    public void setDealer(boolean dealer) {
        isDealer = dealer;
    }
    public double calculateHandValue(List<Double> handValue){
        double totalValue=0;
        for (double d:handValue){
            totalValue+=d;
        }
        return totalValue;
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
                ", playerScore=" + playerScore +
                ", isDealer=" + isDealer +
                ", handValue=" + handValue +
                ", players=" + players +
                '}';
    }
}
