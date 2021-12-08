import java.util.List;

public class Challenger extends Player
{
    public Challenger(String name, int playerNum, boolean isDealer, List<Double> handValue) {
        super(name, playerNum,isDealer,handValue);
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

