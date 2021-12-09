import java.util.List;

public class Challenger extends Player
{

    public Challenger(String name, int playerNum, boolean isDealer, List<Double> handValue, boolean hasWon) {
        super(name, playerNum,isDealer,handValue, hasWon);
    }

   /* public void hitOrStand(){
        double upperLimitOfValue=10.5;
        while(sumOfHandValue()<upperLimitOfValue){
            hit();
        }
    }
    public void hit() {

    }*/
}

