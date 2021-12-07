public class Player {
   public String name;
    private int playerNum;
    private int playerScore;


    public Player(String name, int playerNum) {
        this.name = name;
        this.playerNum = playerNum;
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
                '}';
    }
}