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
                ", cardValue=" + Arrays.toString(cardValue) +
                '}';
    }

    public String getValueName(){

        String name = "Unknown";

        if (cardValue == 0.5; {
           () = "A";
        }
        else if (cardValue == 2) {
            name = "2";
        }
        else if (cardValue == 3) {
            name = "3";
        }
        else if (cardValue == 4) {
            name = "4";

        else if (this.value == 5) {
            name = "Five";
        }
        else if (this.value == 6) {
            name = "Six";
        }
        else if (this.value == 7) {
            name = "Seven";
        }
        else if (this.value == 8) {
            name = "Eight";
        }
        else if (this.value == 9) {

            name = "Nine";
        }
        else if (this.value == 10) {

            name = "Ten";
        }
        else if (this.value == 11) {

            name = "Jack";
        }
        else if (this.value == 12) {

            name = "Queen";
        }
        else if (this.value == "13") {

            name = "King";

        }
        return name;

    }
}