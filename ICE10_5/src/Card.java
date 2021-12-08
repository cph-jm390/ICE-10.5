import java.util.Arrays;

public class Card {


    private String suit;
    private String value;
    private double cardValue;


    public Card(String suit, String value, double cardValue){
        this.suit = suit;
        this.value = value;
        this.cardValue = cardValue;
    }
    public Card(String s, String value){}
    public String getSuit(){
        return suit;
    }
    public void setSuit(String suit){
        this.suit = suit;
    }
    public String getValue(){
        return value;
    }
    public void setValue(String value){
        this.value = value;
    }

    public double getCardValue() {
        return cardValue;
    }

    public void setCardValue(double cardValue) {
        this.cardValue = cardValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", value='" + value + '\'' +
                ", cardValue=" + cardValue +
                '}';
    }
}